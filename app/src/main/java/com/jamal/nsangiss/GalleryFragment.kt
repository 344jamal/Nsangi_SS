package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class GalleryFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_gallery:WebView = view.findViewById(R.id.web_gallery)
        web_gallery.webViewClient = object :WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url:String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_gallery.loadUrl("https://nsangisecondaryschool.com/Gallery.html")
        web_gallery.settings.javaScriptEnabled = true
        web_gallery.settings.allowContentAccess = true
        web_gallery.settings.useWideViewPort = true
        web_gallery.settings.domStorageEnabled = true
    }
}