package com.example.composefoodapp.presntation.screens.food_details

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.composefoodapp.R
import com.example.composefoodapp.data.fake_data.FakeData
import com.example.composefoodapp.domain.models.Food
import com.example.composefoodapp.presntation.components.IconComponents
import com.example.composefoodapp.presntation.theme.ExtraLargeSpacing
import com.example.composefoodapp.presntation.theme.ExtraMediumSpacing
import com.example.composefoodapp.presntation.theme.MediumSpacing

@Preview
@Composable
fun FoodDetailsPreview() {
    FoodDetails(foodModel = FakeData.fakeFoodAll().random())
}


@Composable
fun FoodDetails(
    modifier: Modifier = Modifier
        .background(color = colorResource(id = R.color.white_grey)),
    foodModel: Food,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
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
            FoodDetailsHeader(modifier = modifier)
            Spacer(modifier = modifier.height(ExtraLargeSpacing))
            Spacer(modifier = modifier.height(ExtraLargeSpacing))
            Row(
                modifier = modifier
            ) {
                Column {
                    Text(
                        text = foodModel.title,
                        style = MaterialTheme.typography.headlineSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = if (isSystemInDarkTheme()) Color.White
                            else Color.Black
                        )
                    )
                    Spacer(modifier = modifier.height(ExtraLargeSpacing))
                    Text(
                        modifier = modifier
                            .alpha(0.50f),
                        text = stringResource(id = R.string.price),
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = if (isSystemInDarkTheme()) Color.White
                            else Color.Black
                        )
                    )
                    Spacer(modifier = modifier.height(MediumSpacing))
                    Text(
                        text = foodModel.price,
                        style = MaterialTheme.typography.headlineSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = if (isSystemInDarkTheme()) Color.White
                            else Color.Black
                        )
                    )
                    Spacer(modifier = modifier.height(ExtraLargeSpacing))
                    FoodCountButton()
                }
                Spacer(modifier = modifier.width(ExtraLargeSpacing))
                Column(
                    modifier = modifier
//                        .scale(scaleX = 0.5f, scaleY = 1f)
                        .size(250.dp)

                ) {
                    AsyncImage(
                        modifier = modifier
                            .fillMaxSize()
                            .clip(CircleShape),
                        model = foodModel.imageUrl,
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                }
            }
            FoodDetailsContentBottom(
                foodModel = foodModel)
        }
    }

}


@Composable
fun FoodDetailsHeader(
    modifier: Modifier
) {
    Row(
        modifier = modifier,
    ) {
        IconComponents(iconRes = R.drawable.back_icon)
        Spacer(modifier = modifier.weight(1f))
        IconComponents(iconRes = R.drawable.bag_icon)
    }
}
