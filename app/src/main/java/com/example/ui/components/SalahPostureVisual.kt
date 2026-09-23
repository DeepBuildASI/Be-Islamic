package com.example.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import com.example.data.model.PostureType

@Composable
fun SalahPostureVisual(
    posture: PostureType,
    modifier: Modifier = Modifier,
    lineColor: Color = MaterialTheme.colorScheme.primary,
    accentColor: Color = MaterialTheme.colorScheme.secondary
) {
    Canvas(
        modifier = modifier
            .width(110.dp)
            .height(130.dp)
    ) {
        val strokeWidth = 3.dp.toPx()
        val dashedEffect = PathEffect.dashPathEffect(floatArrayOf(6f, 6f), 0f)

        // Baseline ground
        drawLine(
            color = Color.LightGray,
            start = Offset(size.width * 0.15f, size.height * 0.95f),
            end = Offset(size.width * 0.85f, size.height * 0.95f),
            strokeWidth = 1.5.dp.toPx(),
            pathEffect = dashedEffect
        )

        when (posture) {
            PostureType.TAKBEER -> {
                // Head
                drawCircle(
                    color = lineColor,
                    radius = 12.dp.toPx(),
                    center = Offset(size.width * 0.5f, size.height * 0.22f),
                    style = Stroke(width = strokeWidth)
                )
                // Spine
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.5f, size.height * 0.32f),
                    end = Offset(size.width * 0.5f, size.height * 0.62f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Left arm raised to earlobe
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.5f, size.height * 0.38f),
                    end = Offset(size.width * 0.26f, size.height * 0.35f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.26f, size.height * 0.35f),
                    end = Offset(size.width * 0.28f, size.height * 0.18f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Right arm raised to earlobe
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.5f, size.height * 0.38f),
                    end = Offset(size.width * 0.74f, size.height * 0.35f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.74f, size.height * 0.35f),
                    end = Offset(size.width * 0.72f, size.height * 0.18f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Legs
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.45f, size.height * 0.62f),
                    end = Offset(size.width * 0.43f, size.height * 0.95f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.55f, size.height * 0.62f),
                    end = Offset(size.width * 0.57f, size.height * 0.95f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
            }

            PostureType.QIYAM -> {
                // Head
                drawCircle(
                    color = lineColor,
                    radius = 12.dp.toPx(),
                    center = Offset(size.width * 0.5f, size.height * 0.22f),
                    style = Stroke(width = strokeWidth)
                )
                // Sight line to Sujood spot
                drawLine(
                    color = accentColor,
                    start = Offset(size.width * 0.5f, size.height * 0.26f),
                    end = Offset(size.width * 0.35f, size.height * 0.95f),
                    strokeWidth = 1.dp.toPx(),
                    pathEffect = dashedEffect
                )
                // Spine
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.5f, size.height * 0.32f),
                    end = Offset(size.width * 0.5f, size.height * 0.62f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Arms folded on chest (Right over left)
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.5f, size.height * 0.38f),
                    end = Offset(size.width * 0.38f, size.height * 0.48f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.38f, size.height * 0.48f),
                    end = Offset(size.width * 0.62f, size.height * 0.48f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.62f, size.height * 0.48f),
                    end = Offset(size.width * 0.5f, size.height * 0.38f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Legs
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.46f, size.height * 0.62f),
                    end = Offset(size.width * 0.44f, size.height * 0.95f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.54f, size.height * 0.62f),
                    end = Offset(size.width * 0.56f, size.height * 0.95f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
            }

            PostureType.RUKU -> {
                // Head
                drawCircle(
                    color = lineColor,
                    radius = 11.dp.toPx(),
                    center = Offset(size.width * 0.28f, size.height * 0.50f),
                    style = Stroke(width = strokeWidth)
                )
                // Back horizontal
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.38f, size.height * 0.50f),
                    end = Offset(size.width * 0.72f, size.height * 0.50f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Arms to knees
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.45f, size.height * 0.50f),
                    end = Offset(size.width * 0.62f, size.height * 0.72f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Legs straight
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.72f, size.height * 0.50f),
                    end = Offset(size.width * 0.70f, size.height * 0.95f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
            }

            PostureType.QAWMAH -> {
                // Head
                drawCircle(
                    color = lineColor,
                    radius = 12.dp.toPx(),
                    center = Offset(size.width * 0.5f, size.height * 0.22f),
                    style = Stroke(width = strokeWidth)
                )
                // Spine
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.5f, size.height * 0.32f),
                    end = Offset(size.width * 0.5f, size.height * 0.62f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Arms hanging relaxed at sides
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.5f, size.height * 0.38f),
                    end = Offset(size.width * 0.42f, size.height * 0.58f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.5f, size.height * 0.38f),
                    end = Offset(size.width * 0.58f, size.height * 0.58f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Legs
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.46f, size.height * 0.62f),
                    end = Offset(size.width * 0.44f, size.height * 0.95f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.54f, size.height * 0.62f),
                    end = Offset(size.width * 0.56f, size.height * 0.95f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
            }

            PostureType.SUJOOD -> {
                // Head on ground
                drawCircle(
                    color = lineColor,
                    radius = 10.dp.toPx(),
                    center = Offset(size.width * 0.24f, size.height * 0.88f),
                    style = Stroke(width = strokeWidth)
                )
                // Hands beside head
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.32f, size.height * 0.82f),
                    end = Offset(size.width * 0.32f, size.height * 0.95f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Spine arched from hips to neck
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.32f, size.height * 0.82f),
                    end = Offset(size.width * 0.65f, size.height * 0.65f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Thighs to knees on ground
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.65f, size.height * 0.65f),
                    end = Offset(size.width * 0.58f, size.height * 0.95f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Lower leg & toes on ground
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.58f, size.height * 0.95f),
                    end = Offset(size.width * 0.82f, size.height * 0.95f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
            }

            PostureType.JALSAH, PostureType.TASHAHHUD, PostureType.TASLEEM -> {
                // Head
                drawCircle(
                    color = lineColor,
                    radius = 11.dp.toPx(),
                    center = Offset(size.width * 0.42f, size.height * 0.45f),
                    style = Stroke(width = strokeWidth)
                )
                // Torso upright
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.42f, size.height * 0.54f),
                    end = Offset(size.width * 0.42f, size.height * 0.80f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                // Hands resting on knees
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.42f, size.height * 0.60f),
                    end = Offset(size.width * 0.28f, size.height * 0.82f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                if (posture == PostureType.TASHAHHUD) {
                    // Finger pointing
                    drawLine(
                        color = accentColor,
                        start = Offset(size.width * 0.28f, size.height * 0.82f),
                        end = Offset(size.width * 0.20f, size.height * 0.78f),
                        strokeWidth = strokeWidth,
                        cap = StrokeCap.Round
                    )
                }
                // Sitting legs on ground
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.42f, size.height * 0.80f),
                    end = Offset(size.width * 0.68f, size.height * 0.95f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = lineColor,
                    start = Offset(size.width * 0.68f, size.height * 0.95f),
                    end = Offset(size.width * 0.28f, size.height * 0.95f),
                    strokeWidth = strokeWidth,
                    cap = StrokeCap.Round
                )
            }
        }
    }
}
