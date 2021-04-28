package com.github.desfate.chartlib

/**
 * <p>Interface for chart which is support response notify from other object</p>
 * <p>タッチイベント通知はレスピンズのオブジェクトのインタフェース</p>
 * <p>支持响应事件消息的此类对象接口</p>
 *
 * @see ITouchEventNotify
 */
interface ITouchEventResponse {
    /**
     * <p>Response Notify </p>
     * <p>レスポンスをする</p>
     * <p>响应通知</p>
     *
     * @param chart <p>source chart</p>
     *              <p>ソースチャート</p>
     *              <p>源头对象</p>
     */
    fun notifyEvent(eventId: Int, chart: GridChart?)
}