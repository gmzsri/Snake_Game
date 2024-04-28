package com.example.snakegame

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.dp
import com.example.snakegame.ui.theme.Custard
import com.example.snakegame.ui.theme.RoyalBlue

@Composable
fun SnakeGameScreen()
{
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            Text(
                modifier = Modifier.padding(16.dp),
                text = "Score:5",
                style = MaterialTheme.typography.headlineMedium
                )
        }
        Canvas(modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(ratio = 2 / 3f))
        {
            val cellSize=size.width / 20
            drawGameBoard(
                cellSize = cellSize,
                cellColors = Custard,
                borderCellColors = RoyalBlue,
                gridWidth = 20,
                gridHeight = 30

            )
        }
    }

}

fun drawGameBoard(cellSize: Float, cellColors: Color, borderCellColors: Color, gridWidth: Int) {

}

private fun DrawScope.drawGameBoard(
    cellSize: Float,
    cellColors: Color,
    borderCellColors: Color,
    gridWidth: Int,
    gridHeight: Int
){
    for (i in 0 until gridWidth){
        for (j in 0 until gridWidth) {
            drawRect(
                color = cellColors,
            )
        }
    }
}


