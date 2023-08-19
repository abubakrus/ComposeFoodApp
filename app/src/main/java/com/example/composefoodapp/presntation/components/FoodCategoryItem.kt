package com.example.composefoodapp.presntation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.composefoodapp.R
import com.example.composefoodapp.domain.models.Food
import com.example.composefoodapp.presntation.theme.ExtraMediumSpacing

@Composable
fun FoodCategoryItemList(
    modifier: Modifier = Modifier,
    foodModel: List<Food>
) {
    LazyRow {
        items(
            items = foodModel,
            key = { data -> data.id }
        ) { foodModel ->
            FoodCategoryItem(foodModel = foodModel)
        }
    }
}

@Composable
fun FoodCategoryItem(
    modifier: Modifier = Modifier.padding(8.dp),
    foodModel: Food
) {
    Box(
        modifier = modifier
            .width(180.dp)
            .height(280.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(color = colorResource(id = R.color.white)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = modifier
                    .width(200.dp)
                    .height(150.dp)
            ) {
                AsyncImage(
                    model = foodModel.imageUrl,
                    modifier = modifier
                        .clip(CircleShape)
                        .fillMaxSize(),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
            Column {
                Text(
                    text = foodModel.title,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = if (isSystemInDarkTheme()) Color.White
                        else Color.Black
                    )
                )
                Spacer(modifier = modifier.height(ExtraMediumSpacing))
                Text(
                    text = foodModel.shortDescription,
                    style = MaterialTheme.typography.bodySmall.copy(
                        fontWeight = FontWeight.Normal,
                        color = if (isSystemInDarkTheme()) Color.White
                        else Color.Black
                    )
                )
                Spacer(modifier = modifier.height(ExtraMediumSpacing))
                Text(
                    text = "c" + foodModel.price,
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