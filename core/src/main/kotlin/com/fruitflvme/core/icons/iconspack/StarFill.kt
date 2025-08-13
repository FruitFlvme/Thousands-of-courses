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

val IconsPack.StarFill: ImageVector
    get() {
        if (_starfill != null) {
            return _starfill!!
        }
        _starfill = Builder(
            name = "StarFill", defaultWidth = 12.0.dp, defaultHeight = 12.0.dp,
            viewportWidth = 12.0f, viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF12B956)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0119f, 1.2207f)
                curveTo(5.7264f, 1.2206f, 5.4349f, 1.3982f, 5.2623f, 1.7517f)
                lineTo(4.2003f, 3.9381f)
                lineTo(1.7797f, 4.2816f)
                curveTo(1.0013f, 4.3899f, 0.7491f, 5.1536f, 1.3112f, 5.7026f)
                lineTo(3.0603f, 7.4051f)
                lineTo(2.6543f, 9.7946f)
                curveTo(2.5206f, 10.5681f, 3.1621f, 11.0356f, 3.8568f, 10.6691f)
                curveTo(4.1252f, 10.5271f, 5.5052f, 9.8121f, 6.0119f, 9.5446f)
                lineTo(8.167f, 10.6691f)
                curveTo(8.8624f, 11.0356f, 9.5059f, 10.5686f, 9.3695f, 9.7946f)
                lineTo(8.9478f, 7.4051f)
                lineTo(10.6969f, 5.7026f)
                curveTo(11.2617f, 5.1556f, 11.0225f, 4.3921f, 10.244f, 4.2816f)
                lineTo(7.8078f, 3.9381f)
                lineTo(6.7615f, 1.7517f)
                curveTo(6.5891f, 1.3981f, 6.2973f, 1.2208f, 6.0119f, 1.2207f)
                close()
            }
        }
            .build()
        return _starfill!!
    }

private var _starfill: ImageVector? = null
