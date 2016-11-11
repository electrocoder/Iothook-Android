package com.iothook.ele.iothook;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class PublicChannelsFragment extends Fragment {


    public PublicChannelsFragment() {
        // Required empty public constructor
    }

    WebView webview_public_channels;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_public_channels, container, false);

        webview_public_channels = (WebView) view.findViewById(R.id.webview_public_channels);
        webview_public_channels.getSettings().setJavaScriptEnabled(true);
        webview_public_channels.setWebViewClient(new SwAWebClient());
        webview_public_channels.loadUrl("https://iothook.com/channels/public");

        return view;
    }

    private class SwAWebClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }

    }

}
