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

val IconsPack.ArrowRightShortFill: ImageVector
    get() {
        if (_arrowrightshortfill != null) {
            return _arrowrightshortfill!!
        }
        _arrowrightshortfill = Builder(
            name = "ArrowRightShortFill", defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF12B956)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0079f, 7.9923f)
                curveTo(4.0079f, 7.6243f, 4.3066f, 7.3257f, 4.6746f, 7.3257f)
                horizontalLineTo(8.6746f)
                verticalLineTo(4.659f)
                lineTo(12.0079f, 7.9923f)
                lineTo(8.6746f, 11.3257f)
                verticalLineTo(8.659f)
                horizontalLineTo(4.6746f)
                curveTo(4.3066f, 8.659f, 4.0079f, 8.3603f, 4.0079f, 7.9923f)
                close()
            }
        }
            .build()
        return _arrowrightshortfill!!
    }

private var _arrowrightshortfill: ImageVector? = null
