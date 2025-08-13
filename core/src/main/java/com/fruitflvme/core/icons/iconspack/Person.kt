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

public val IconsPack.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 25.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFF2F2F3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3311f, 1.9532f)
                curveTo(9.5696f, 1.9532f, 7.331f, 4.1918f, 7.331f, 6.9532f)
                curveTo(7.331f, 9.7146f, 9.5696f, 11.9532f, 12.3311f, 11.9532f)
                curveTo(15.0925f, 11.9532f, 17.3311f, 9.7146f, 17.3311f, 6.9532f)
                curveTo(17.3311f, 4.1918f, 15.0925f, 1.9532f, 12.3311f, 1.9532f)
                close()
                moveTo(12.3311f, 3.9532f)
                curveTo(13.988f, 3.9532f, 15.3311f, 5.2963f, 15.3311f, 6.9532f)
                curveTo(15.3311f, 8.6101f, 13.988f, 9.9532f, 12.3311f, 9.9532f)
                curveTo(10.6742f, 9.9532f, 9.331f, 8.6101f, 9.331f, 6.9532f)
                curveTo(9.331f, 5.2963f, 10.6742f, 3.9532f, 12.3311f, 3.9532f)
                close()
                moveTo(8.7999f, 13.2657f)
                curveTo(6.1856f, 13.9802f, 4.331f, 16.2534f, 4.331f, 18.9532f)
                verticalLineTo(20.9532f)
                curveTo(4.331f, 21.5055f, 4.7787f, 21.9532f, 5.331f, 21.9532f)
                horizontalLineTo(19.3311f)
                curveTo(19.8834f, 21.9532f, 20.3311f, 21.5055f, 20.3311f, 20.9532f)
                verticalLineTo(18.9532f)
                curveTo(20.3311f, 16.2534f, 18.4766f, 13.9802f, 15.8623f, 13.2657f)
                curveTo(15.6382f, 13.2044f, 15.418f, 13.2327f, 15.2061f, 13.3282f)
                curveTo(14.2906f, 13.7408f, 13.316f, 13.9532f, 12.3311f, 13.9532f)
                curveTo(11.3462f, 13.9532f, 10.3716f, 13.7408f, 9.456f, 13.3282f)
                curveTo(9.2442f, 13.2327f, 9.0239f, 13.2044f, 8.7999f, 13.2657f)
                close()
                moveTo(9.206f, 15.2657f)
                curveTo(10.2159f, 15.6476f, 11.2508f, 15.9532f, 12.3311f, 15.9532f)
                curveTo(13.4114f, 15.9532f, 14.4463f, 15.6476f, 15.4561f, 15.2657f)
                curveTo(17.1595f, 15.7817f, 18.3311f, 17.2196f, 18.3311f, 18.9532f)
                verticalLineTo(19.9532f)
                horizontalLineTo(6.331f)
                verticalLineTo(18.9532f)
                curveTo(6.331f, 17.2196f, 7.5026f, 15.7817f, 9.206f, 15.2657f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
