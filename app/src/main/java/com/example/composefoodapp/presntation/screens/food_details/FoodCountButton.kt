package com.example.composefoodapp.presntation.screens.food_details

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Clear
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefoodapp.R
import com.example.composefoodapp.presntation.theme.SmallSpacing

@Preview
@Composable
fun FoodCountButtonPreview() {
    FoodCountButton()
}


@Composable
fun FoodCountButton(
    modifier: Modifier = Modifier,

    ) {
    Column(
        modifier = modifier
    ) {
        var count by remember {
            mutableIntStateOf(0)
        }
        Text(
            modifier = modifier
                .alpha(0.50f),
            text = stringResource(id = R.string.choice_quantity),
            style = MaterialTheme.typography.bodyMedium.copy(
                fontWeight = FontWeight.SemiBold,
                color = if (isSystemInDarkTheme()) Color.White
                else Color.Black
            )
        )
        Spacer(modifier = modifier.height(SmallSpacing))
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = {
                    if (count > 0) { count-- } },
                modifier = modifier
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.White)
            ) {
                Text(
                    text = "-",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = if (isSystemInDarkTheme()) Color.White
                        else Color.Black
                    )
                )
            }
            Text(
                text = count.toString(),
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold,
                    color = if (isSystemInDarkTheme()) Color.White
                    else Color.Black
                )
            )
            IconButton(
                onClick = { count++ },
                modifier = modifier
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.White)
            )
            {
                Text(
                    text = "+",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = if (isSystemInDarkTheme()) Color.White
                        else Color.Black
                    )
                )
            }
        }

    }
}


