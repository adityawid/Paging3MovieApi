package com.adityawidayanto.paging3movieapi.network

import com.adityawidayanto.paging3movieapi.utils.Constants
import okhttp3.Interceptor
import okhttp3.Response

class NetworkInterceptor : Interceptor {
    @Throws(Throwable::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val requestBuilder = request.newBuilder()
            .addHeader(Constants.APP_CONTENT_TYPE, Constants.APP_CONTENT_TYPE_VAL)
            .addHeader(Constants.APP_ACCEPT, Constants.APP_CONTENT_TYPE_VAL)

        request = requestBuilder.build()
        return chain.proceed(request)
    }

}