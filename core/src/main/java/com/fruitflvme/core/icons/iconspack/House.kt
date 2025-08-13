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

public val IconsPack.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 25.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFF2F2F3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.678f, 2.0141f)
                curveTo(11.803f, 2.0141f, 10.939f, 2.3471f, 10.271f, 3.0141f)
                lineTo(2.959f, 10.2951f)
                curveTo(2.568f, 10.6861f, 2.568f, 11.3421f, 2.959f, 11.7331f)
                lineTo(4.678f, 13.4521f)
                verticalLineTo(17.0141f)
                curveTo(4.678f, 19.223f, 6.469f, 21.014f, 8.678f, 21.014f)
                horizontalLineTo(16.678f)
                curveTo(18.887f, 21.014f, 20.678f, 19.223f, 20.678f, 17.0141f)
                verticalLineTo(13.4521f)
                lineTo(22.396f, 11.7331f)
                curveTo(22.787f, 11.3421f, 22.787f, 10.6861f, 22.396f, 10.2951f)
                curveTo(22.057f, 9.9561f, 20.815f, 8.7081f, 19.678f, 7.5761f)
                verticalLineTo(5.0141f)
                curveTo(19.678f, 4.4621f, 19.23f, 4.0141f, 18.678f, 4.0141f)
                curveTo(18.125f, 4.0141f, 17.678f, 4.4621f, 17.678f, 5.0141f)
                verticalLineTo(5.6081f)
                curveTo(16.608f, 4.5431f, 15.408f, 3.3381f, 15.084f, 3.0141f)
                curveTo(14.416f, 2.3471f, 13.552f, 2.0141f, 12.678f, 2.0141f)
                close()
                moveTo(12.678f, 4.0141f)
                curveTo(13.041f, 4.0141f, 13.401f, 4.1431f, 13.678f, 4.4201f)
                curveTo(14.212f, 4.9551f, 16.227f, 6.9601f, 17.959f, 8.7021f)
                curveTo(17.966f, 8.7091f, 17.952f, 8.7261f, 17.959f, 8.7331f)
                curveTo(17.965f, 8.7391f, 17.984f, 8.7261f, 17.99f, 8.7331f)
                curveTo(18.905f, 9.6521f, 19.706f, 10.4801f, 20.24f, 11.0141f)
                lineTo(18.959f, 12.2951f)
                curveTo(18.772f, 12.4831f, 18.678f, 12.7491f, 18.678f, 13.0141f)
                verticalLineTo(17.0141f)
                curveTo(18.678f, 18.119f, 17.782f, 19.014f, 16.678f, 19.014f)
                horizontalLineTo(8.678f)
                curveTo(7.573f, 19.014f, 6.678f, 18.119f, 6.678f, 17.0141f)
                verticalLineTo(13.0141f)
                curveTo(6.678f, 12.7491f, 6.584f, 12.4831f, 6.396f, 12.2951f)
                lineTo(5.115f, 11.0141f)
                lineTo(11.678f, 4.4201f)
                curveTo(11.955f, 4.1431f, 12.315f, 4.0141f, 12.678f, 4.0141f)
                close()
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null
