package com.su.mediabox.pluginapi.v2.components

import com.su.mediabox.pluginapi.components.IBaseComponent
import com.su.mediabox.pluginapi.v2.action.ClassifyAction
import com.su.mediabox.pluginapi.v2.been.BaseData
import com.su.mediabox.pluginapi.v2.been.ClassifyItemData
import com.su.mediabox.pluginapi.v2.been.VideoInfoItemData

/**
 * 媒体分类数据组件
 */
interface IMediaClassifyDataComponent : IBaseComponent {

    /**
     * 获取分类页分类弹窗里的分类项数据，如：地区-大陆
     *
     * 宿主在获取所有分类项数据后会根据[ClassifyAction.classifyCategory]自动进行分类
     */
    suspend fun getClassifyItemData(): List<ClassifyItemData>

    /**
     * 获取分类页分类下的媒体数据，如获取地区-分类下的所有作品数据
     * @param classifyAction 分类数据，见内部注释[ClassifyAction]
     * @param page 页码，由宿主控制（成功请求+1，刷新则清0）
     */
    suspend fun getClassifyData(classifyAction: ClassifyAction, page: Int): List<BaseData>

}