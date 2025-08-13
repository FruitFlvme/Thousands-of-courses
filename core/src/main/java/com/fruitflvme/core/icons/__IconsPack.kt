package com.fruitflvme.core.icons

import androidx.compose.ui.graphics.vector.ImageVector
import com.fruitflvme.core.icons.iconspack.ArrowDownUp
import com.fruitflvme.core.icons.iconspack.ArrowRightShortFill
import com.fruitflvme.core.icons.iconspack.Bookmark
import com.fruitflvme.core.icons.iconspack.BookmarkFill
import com.fruitflvme.core.icons.iconspack.Funnel
import com.fruitflvme.core.icons.iconspack.House
import com.fruitflvme.core.icons.iconspack.Ok
import com.fruitflvme.core.icons.iconspack.Person
import com.fruitflvme.core.icons.iconspack.Search
import com.fruitflvme.core.icons.iconspack.StarFill
import com.fruitflvme.core.icons.iconspack.Vk
import kotlin.collections.List as ____KtList

object IconsPack

private var __Icons: ____KtList<ImageVector>? = null

val IconsPack.Icons: ____KtList<ImageVector>
    get() {
        if (__Icons != null) {
            return __Icons!!
        }
        __Icons = listOf(
            House, Funnel, StarFill, Person, ArrowRightShortFill, Bookmark, Search,
            BookmarkFill, ArrowDownUp, Vk, Ok
        )
        return __Icons!!
    }
