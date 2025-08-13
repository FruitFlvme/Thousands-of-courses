package com.fruitflvme.core.icons.iconspack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.fruitflvme.core.icons.IconsPack

public val IconsPack.Ok: ImageVector
    get() {
        if (_ok != null) {
            return _ok!!
        }
        _ok = Builder(name = "Ok", defaultWidth = 50.0.dp, defaultHeight = 40.0.dp, viewportWidth =
                50.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.7572f, 25.879f)
                curveTo(29.1443f, 25.5672f, 30.482f, 25.0258f, 31.7142f, 24.2623f)
                curveTo(32.6466f, 23.6822f, 32.9275f, 22.4661f, 32.34f, 21.5462f)
                curveTo(31.7529f, 20.6242f, 30.5212f, 20.3466f, 29.5871f, 20.9267f)
                curveTo(26.7958f, 22.6584f, 23.2021f, 22.658f, 20.4125f, 20.9267f)
                curveTo(19.4784f, 20.3466f, 18.2462f, 20.6242f, 17.6603f, 21.5462f)
                curveTo(17.0728f, 22.467f, 17.3529f, 23.6822f, 18.2854f, 24.2623f)
                curveTo(19.5175f, 25.025f, 20.8553f, 25.5672f, 22.2423f, 25.879f)
                lineTo(18.4326f, 29.6378f)
                curveTo(17.6538f, 30.4069f, 17.6538f, 31.654f, 18.4334f, 32.4231f)
                curveTo(18.8236f, 32.8073f, 19.3341f, 32.9995f, 19.8445f, 32.9995f)
                curveTo(20.3558f, 32.9995f, 20.8671f, 32.8073f, 21.2573f, 32.4231f)
                lineTo(24.9994f, 28.7295f)
                lineTo(28.7447f, 32.4231f)
                curveTo(29.5235f, 33.1922f, 30.787f, 33.1922f, 31.5666f, 32.4231f)
                curveTo(32.3469f, 31.654f, 32.3469f, 30.4061f, 31.5666f, 29.6378f)
                lineTo(27.7572f, 25.879f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.7759f, 13.7169f)
                curveTo(31.7759f, 17.4197f, 28.716f, 20.4317f, 24.9517f, 20.4317f)
                curveTo(21.1882f, 20.4317f, 18.1274f, 17.4197f, 18.1274f, 13.7169f)
                curveTo(18.1274f, 10.0128f, 21.1882f, 7.0f, 24.9517f, 7.0f)
                curveTo(28.716f, 7.0f, 31.7759f, 10.0128f, 31.7759f, 13.7169f)
                close()
                moveTo(27.7773f, 13.7168f)
                curveTo(27.7773f, 12.1833f, 26.5099f, 10.9363f, 24.9517f, 10.9363f)
                curveTo(23.3948f, 10.9363f, 22.1261f, 12.1833f, 22.1261f, 13.7168f)
                curveTo(22.1261f, 15.2492f, 23.3948f, 16.497f, 24.9517f, 16.497f)
                curveTo(26.5099f, 16.497f, 27.7773f, 15.2492f, 27.7773f, 13.7168f)
                close()
            }
        }
        .build()
        return _ok!!
    }

private var _ok: ImageVector? = null
