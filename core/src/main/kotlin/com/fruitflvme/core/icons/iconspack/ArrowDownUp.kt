package com.fruitflvme.core.icons.iconspack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.fruitflvme.core.icons.IconsPack

val IconsPack.ArrowDownUp: ImageVector
    get() {
        if (_arrowdownup != null) {
            return _arrowdownup!!
        }
        _arrowdownup = Builder(
            name = "ArrowDownUp", defaultWidth = 16.0.dp, defaultHeight =
            16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF12B956)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.6716f, 1.3428f)
                curveTo(10.501f, 1.3428f, 10.3226f, 1.4001f, 10.1924f, 1.5301f)
                lineTo(7.7341f, 4.0094f)
                lineTo(8.6716f, 4.9468f)
                lineTo(10.005f, 3.6348f)
                verticalLineTo(13.3428f)
                curveTo(10.005f, 13.7108f, 10.3034f, 14.0094f, 10.6716f, 14.0094f)
                curveTo(11.0398f, 14.0094f, 11.3383f, 13.7108f, 11.3383f, 13.3428f)
                verticalLineTo(3.6348f)
                lineTo(12.6716f, 4.9468f)
                lineTo(13.6091f, 4.0094f)
                lineTo(11.1508f, 1.5301f)
                curveTo(11.0206f, 1.4001f, 10.8422f, 1.3428f, 10.6716f, 1.3428f)
                close()
                moveTo(5.3383f, 2.0094f)
                curveTo(4.9701f, 2.0094f, 4.6716f, 2.3081f, 4.6716f, 2.6761f)
                verticalLineTo(12.3841f)
                lineTo(3.3383f, 11.0721f)
                lineTo(2.4008f, 12.0094f)
                lineTo(4.8591f, 14.4888f)
                curveTo(5.1195f, 14.7488f, 5.5571f, 14.7488f, 5.8174f, 14.4888f)
                lineTo(8.2758f, 12.0094f)
                lineTo(7.3383f, 11.0721f)
                lineTo(6.005f, 12.3841f)
                verticalLineTo(2.6761f)
                curveTo(6.005f, 2.3081f, 5.7065f, 2.0094f, 5.3383f, 2.0094f)
                close()
            }
        }
            .build()
        return _arrowdownup!!
    }

private var _arrowdownup: ImageVector? = null
