package com.jamal.nsangiss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class AdmissionsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admissions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val web_admissions:WebView = view.findViewById(R.id.web_admissions)
        web_admissions.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url:String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web_admissions.loadUrl("https://nsangisecondaryschool.com/admissions.html")
        web_admissions.settings.javaScriptEnabled = true
        web_admissions.settings.allowContentAccess = true
        web_admissions.settings.useWideViewPort = true
        web_admissions.settings.domStorageEnabled = true
    }
}