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

public val IconsPack.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFF2F2F3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9978f, 2.0142f)
                curveTo(5.4458f, 2.0142f, 3.9978f, 3.4606f, 3.9978f, 6.0107f)
                verticalLineTo(20.9975f)
                curveTo(3.9978f, 21.7148f, 4.7128f, 22.2167f, 5.3728f, 21.9342f)
                lineTo(11.9978f, 19.0929f)
                lineTo(18.5918f, 21.9342f)
                curveTo(19.2518f, 22.2167f, 19.9978f, 21.7148f, 19.9978f, 20.9975f)
                verticalLineTo(6.0107f)
                curveTo(19.9978f, 3.3896f, 18.6928f, 2.0142f, 15.9978f, 2.0142f)
                horizontalLineTo(7.9978f)
                close()
                moveTo(7.9978f, 4.0124f)
                horizontalLineTo(15.9978f)
                curveTo(17.5638f, 4.0124f, 17.9978f, 4.4699f, 17.9978f, 6.0107f)
                verticalLineTo(19.4988f)
                lineTo(12.3728f, 17.0947f)
                curveTo(12.1208f, 16.987f, 11.8428f, 16.987f, 11.5918f, 17.0947f)
                lineTo(5.9978f, 19.4988f)
                verticalLineTo(6.0107f)
                curveTo(5.9978f, 4.5642f, 6.5498f, 4.0124f, 7.9978f, 4.0124f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
