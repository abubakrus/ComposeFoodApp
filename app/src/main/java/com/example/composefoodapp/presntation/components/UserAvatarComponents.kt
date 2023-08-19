package com.example.composefoodapp.presntation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefoodapp.R


@Preview
@Composable
fun UserAvatarComponentsPreview() {
    UserAvatarComponents()
}
@Composable
fun UserAvatarComponents(
    modifier: Modifier = Modifier
) {
    Column {
        Box(
            modifier = modifier
                .size(40.dp)
                .border(1.dp, color = Color.Red, CircleShape)
        ) {
            Image(
                painter = painterResource(id = R.drawable.user_avatar),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
    }

}