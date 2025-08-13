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

public val IconsPack.Vk: ImageVector
    get() {
        if (_vk != null) {
            return _vk!!
        }
        _vk = Builder(name = "Vk", defaultWidth = 50.0.dp, defaultHeight = 40.0.dp, viewportWidth =
                50.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.3213f, 28.0f)
                curveTo(17.5378f, 28.0f, 12.2072f, 21.9889f, 12.0f, 12.0f)
                horizontalLineTo(16.4486f)
                curveTo(16.5873f, 19.3376f, 19.9717f, 22.4515f, 22.5661f, 23.0862f)
                verticalLineTo(12.0f)
                horizontalLineTo(26.8309f)
                verticalLineTo(18.3308f)
                curveTo(29.3333f, 18.0573f, 31.9511f, 15.1769f, 32.833f, 12.0f)
                horizontalLineTo(37.0261f)
                curveTo(36.3545f, 15.9086f, 33.5046f, 18.7888f, 31.4883f, 19.9769f)
                curveTo(33.5046f, 20.9375f, 36.7487f, 23.452f, 38.0f, 28.0f)
                horizontalLineTo(33.3893f)
                curveTo(32.4155f, 24.9598f, 30.0283f, 22.6052f, 26.8309f, 22.2855f)
                verticalLineTo(28.0f)
                horizontalLineTo(26.3213f)
                close()
            }
        }
        .build()
        return _vk!!
    }

private var _vk: ImageVector? = null
