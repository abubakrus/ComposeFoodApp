package com.example.composefoodapp.presntation.screens.main_screen

import android.telecom.Call.Details
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composefoodapp.R
import com.example.composefoodapp.data.fake_data.FakeData
import com.example.composefoodapp.presntation.components.FoodCategoryItemList
import com.example.composefoodapp.presntation.components.IconComponents
import com.example.composefoodapp.presntation.components.UserAvatarComponents
import com.example.composefoodapp.presntation.theme.ExtraLargeSpacing
import com.example.composefoodapp.presntation.theme.MediumSpacing
import com.example.composefoodapp.presntation.components.FoodCategoryItem as FoodCategoryItem

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen(onClickNavigateToDetails = {})
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    modifier: Modifier = Modifier.background(color = colorResource(id = R.color.white_grey)),
    onClickNavigateToDetails: () -> Unit
) {
    Box(
        modifier = modifier,
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(
                    top = ExtraLargeSpacing,
                    start = MediumSpacing,
                    end = MediumSpacing
                ),
        ) {
            Row(
                modifier = modifier,
            ) {
                IconComponents(iconRes = R.drawable.menu_icon)
                Spacer(modifier = modifier.weight(1f))
                UserAvatarComponents()
            }
            Spacer(modifier = modifier.height(ExtraLargeSpacing))
            Column(
                modifier = modifier,
            ) {
                Text(
                    text = stringResource(id = R.string.greeting_text),
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = if (isSystemInDarkTheme()) Color.White else Color.Black
                    )
                )
                Spacer(modifier = modifier.height(ExtraLargeSpacing))
                val (value, onValueChange) = remember { mutableStateOf("") }
                OutlinedTextField(
                    value = value,
                    onValueChange = onValueChange,
                    textStyle = TextStyle(fontSize = 17.sp),
                    shape = CircleShape,

                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = null,
                            tint = Color.Gray
                        )
                    },
                    modifier = modifier
                        .padding(start = 30.dp)
                        .background(Color(0xFFE7F1F1), RoundedCornerShape(24.dp)),
                    placeholder = { Text(text = "Start Search") },
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        cursorColor = Color.DarkGray,

                        )
                )
            }
            Spacer(modifier = modifier.height(ExtraLargeSpacing))
            TitleCategoryFood()
            Spacer(modifier = modifier.height(ExtraLargeSpacing))
            FoodCategoryItemList(foodModel = FakeData.fakeFoodAll(),
                onClick = onClickNavigateToDetails)
        }
    }
}

@Composable
fun TitleCategoryFood(modifier: Modifier = Modifier) {
    val titleList = listOf(
        stringResource(id = R.string.all),
        stringResource(id = R.string.healthy_food),
        stringResource(id = R.string.junk_food),
        stringResource(id = R.string.dessert_food)
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.padding(horizontal = 16.dp)
    ) {
        items(items = titleList) {
            Text(text = it)
        }
    }
}