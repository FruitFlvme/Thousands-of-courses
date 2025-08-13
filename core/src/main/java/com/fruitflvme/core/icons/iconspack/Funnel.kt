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

public val IconsPack.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFF2F2F3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5288f, 2.0141f)
                curveTo(5.1258f, 2.0141f, 3.9978f, 3.1421f, 3.9978f, 4.5441f)
                verticalLineTo(4.5751f)
                curveTo(3.9978f, 6.0971f, 4.7488f, 7.2931f, 6.6228f, 9.1661f)
                curveTo(6.5038f, 9.0471f, 7.0198f, 9.5261f, 7.1538f, 9.6661f)
                curveTo(7.3688f, 9.8881f, 7.5388f, 10.1261f, 7.7168f, 10.3531f)
                curveTo(8.5318f, 11.3951f, 8.9978f, 12.5541f, 8.9978f, 14.0071f)
                curveTo(8.9978f, 14.9261f, 8.9978f, 19.7231f, 8.9978f, 21.0031f)
                curveTo(8.9978f, 21.8261f, 9.9318f, 22.3091f, 10.5918f, 21.8151f)
                curveTo(11.0918f, 21.4401f, 14.0918f, 19.1911f, 14.5918f, 18.8161f)
                curveTo(14.8438f, 18.6281f, 14.9978f, 18.3191f, 14.9978f, 18.0041f)
                curveTo(14.9978f, 17.8801f, 14.9978f, 16.0061f, 14.9978f, 14.0071f)
                curveTo(14.9978f, 12.5551f, 15.4648f, 11.3951f, 16.2788f, 10.3531f)
                curveTo(16.4568f, 10.1251f, 16.6268f, 9.8891f, 16.8418f, 9.6661f)
                curveTo(16.9758f, 9.5261f, 17.4928f, 9.0461f, 17.3728f, 9.1661f)
                curveTo(19.2478f, 7.2921f, 19.9978f, 6.0981f, 19.9978f, 4.5751f)
                verticalLineTo(4.5441f)
                curveTo(19.9978f, 3.1421f, 18.8698f, 2.0141f, 17.4668f, 2.0141f)
                horizontalLineTo(6.5288f)
                close()
                moveTo(6.5288f, 4.0131f)
                horizontalLineTo(17.4668f)
                curveTo(17.7648f, 4.0131f, 17.9978f, 4.2461f, 17.9978f, 4.5441f)
                verticalLineTo(4.5751f)
                curveTo(17.9978f, 5.4111f, 17.4928f, 6.2351f, 15.9668f, 7.7611f)
                curveTo(16.1048f, 7.6231f, 15.5588f, 8.1311f, 15.4038f, 8.2921f)
                curveTo(15.1448f, 8.5611f, 14.9088f, 8.8171f, 14.6858f, 9.1041f)
                curveTo(13.6118f, 10.4771f, 12.9978f, 12.0751f, 12.9978f, 14.0071f)
                curveTo(12.9978f, 15.7561f, 12.9978f, 17.0351f, 12.9978f, 17.5051f)
                curveTo(12.5178f, 17.8651f, 11.8468f, 18.3681f, 10.9978f, 19.0041f)
                curveTo(10.9978f, 17.0851f, 10.9978f, 14.6641f, 10.9978f, 14.0071f)
                curveTo(10.9978f, 12.0741f, 10.3838f, 10.4771f, 9.3098f, 9.1041f)
                curveTo(9.0868f, 8.8181f, 8.8508f, 8.5611f, 8.5918f, 8.2921f)
                curveTo(8.4368f, 8.1311f, 7.8918f, 7.6241f, 8.0288f, 7.7611f)
                curveTo(6.5028f, 6.2361f, 5.9978f, 5.4101f, 5.9978f, 4.5751f)
                verticalLineTo(4.5441f)
                curveTo(5.9978f, 4.2461f, 6.2308f, 4.0131f, 6.5288f, 4.0131f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
