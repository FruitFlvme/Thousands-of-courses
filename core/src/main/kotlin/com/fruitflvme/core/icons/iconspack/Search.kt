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

public val IconsPack.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFF2F2F3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0142f, 1.9532f)
                curveTo(5.5959f, 1.9532f, 2.0142f, 5.5352f, 2.0142f, 9.9532f)
                curveTo(2.0142f, 14.3712f, 5.5959f, 17.9532f, 10.0142f, 17.9532f)
                curveTo(11.8509f, 17.9532f, 13.5918f, 17.3222f, 14.9421f, 16.2822f)
                lineTo(19.2954f, 20.6722f)
                curveTo(19.686f, 21.0622f, 20.3424f, 21.0622f, 20.733f, 20.6722f)
                curveTo(21.1235f, 20.2812f, 21.1235f, 19.6252f, 20.733f, 19.2342f)
                lineTo(16.3495f, 14.8742f)
                curveTo(17.3903f, 13.5242f, 18.0142f, 11.7902f, 18.0142f, 9.9532f)
                curveTo(18.0142f, 5.5352f, 14.4325f, 1.9532f, 10.0142f, 1.9532f)
                close()
                moveTo(10.0142f, 3.9532f)
                curveTo(13.3279f, 3.9532f, 16.0142f, 6.6392f, 16.0142f, 9.9532f)
                curveTo(16.0142f, 13.2672f, 13.3279f, 15.9532f, 10.0142f, 15.9532f)
                curveTo(6.7005f, 15.9532f, 4.0142f, 13.2672f, 4.0142f, 9.9532f)
                curveTo(4.0142f, 6.6392f, 6.7005f, 3.9532f, 10.0142f, 3.9532f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
