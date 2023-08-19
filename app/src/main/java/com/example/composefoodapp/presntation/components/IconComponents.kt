package com.example.composefoodapp.presntation.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composefoodapp.R


@Composable
fun IconComponents(
    modifier: Modifier = Modifier,
    iconRes:Int,
) {
    Column(
        modifier = modifier,
    ) {
        Row {
            Icon(

                painter = painterResource(id = iconRes),
                contentDescription = null,
                tint = if (isSystemInDarkTheme()) colorResource(id = R.color.white_grey)
                else colorResource(id = R.color.black)
            )
        }
    }
}