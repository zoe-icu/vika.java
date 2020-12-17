package cn.vika.api.http;

import cn.vika.core.http.DefaultHttpClient;
import cn.vika.core.http.HttpHeaderConstants;

/**
 * public api client
 *
 * @author Zoe Zheng
 * @date 2020-12-16 11:27:39
 */
public abstract class AbstractApi {

    /**
     * api credential
     */
    protected ApiCredential credential;
    /**
     * http client
     */
    protected ApiHttpClient httpClient;

    public AbstractApi(ApiCredential credential) {
        this.credential = credential;
        httpClient = new ApiHttpClient();
    }

    public AbstractApi(ApiCredential credential, ApiHttpClient httpClient) {
        this.credential = credential;
        this.httpClient = httpClient;
    }

    protected DefaultHttpClient getDefaultHttpClient() {
        DefaultHttpClient defaultHttpClient = httpClient.getDefaultHttpClient();
        defaultHttpClient.addGlobalHeader(HttpHeaderConstants.AUTHORIZATION, "Bearer " + credential.getToken());
        return defaultHttpClient;
    }
}