package com.github.desfate.chartlib

/**
 * <p>Interface for chart which is support send notify after touch event happened</p>
 * <p>タッチイベントは通知可能のオブジェクトのインタフェース</p>
 * <p>touch事件发生后，支持对外发送事件消息的此类对象接口</p>
 *
 * @see
 */
interface ITouchEventNotify {

    /**
     *
     * Notify all ITouchEventResponse objects
     *
     * 全部ITouchEventResponseレスポンスオブジェクトを通知
     *
     * 通知全部ITouchEventResponse响应对象
     *
     * @param chart
     *
     *source chart
     *
     * ソースチャート
     *
     * 源头对象
     */
    fun notifyEventAll(eventId: Int, chart: GridChart?)

    /**
     *
     * Add a ITouchEventResponse object by its index
     *
     * ITouchEventResponseレスポンスオブジェクトを追加
     *
     * 增加ITouchEventResponse响应对象
     *
     * @param notify
     *
     *ITouchEventResponse object
     *
     * ITouchEventResponse オブジェクト
     *
     * 对象
     */
    fun addNotify(notify: ITouchEventResponse?)

    /**
     *
     * Remove a ITouchEventResponse object by its index
     *
     * ITouchEventResponseレスポンスオブジェクトを削除
     *
     * 删除ITouchEventResponse响应对象
     *
     * @param i
     *
     *index
     *
     * インデックス
     *
     * index
     */
    fun removeNotify(i: Int)

    /**
     *
     * Remove all ITouchEventResponse objects
     *
     * 全部ITouchEventResponseレスポンスオブジェクトを削除
     *
     * 删除全部ITouchEventResponse响应对象
     */
    fun removeAllNotify()
}