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

val IconsPack.BookmarkFill: ImageVector
    get() {
        if (_bookmarkfill != null) {
            return _bookmarkfill!!
        }
        _bookmarkfill = Builder(
            name = "Bookmarkfill", defaultWidth = 16.0.dp, defaultHeight =
            16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF12B956)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.332f, 1.3428f)
                curveTo(3.6306f, 1.3428f, 2.6653f, 2.3083f, 2.6653f, 4.0108f)
                verticalLineTo(14.0161f)
                curveTo(2.6653f, 14.495f, 3.1626f, 14.8088f, 3.6026f, 14.6206f)
                lineTo(7.9986f, 12.7446f)
                lineTo(12.3946f, 14.6206f)
                curveTo(12.8346f, 14.8092f, 13.332f, 14.4948f, 13.332f, 14.0161f)
                verticalLineTo(4.0108f)
                curveTo(13.332f, 2.261f, 12.462f, 1.3428f, 10.6653f, 1.3428f)
                horizontalLineTo(5.332f)
                close()
            }
        }
            .build()
        return _bookmarkfill!!
    }

private var _bookmarkfill: ImageVector? = null
