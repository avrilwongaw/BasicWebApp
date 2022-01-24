package com.develogical.web;

import java.io.PrintWriter;

public class IndexPage extends HtmlPage {

    @Override
    protected void writeContentTo(PrintWriter writer) {
        writer.println(
                "<h1>Welcome!</h1>" +
                "<img src=\"https://64.media.tumblr.com/0e0b7cf246cf16481eec467f7792c5e1/tumblr_inline_qt4ul8HDdK1u52vn8_500.gif\">" +
                "<p><a href=\"https://gold-pavilion.tumblr.com/\" target=\"_blank\"><em><small>(gif by gold-pavilion/akai-koutei!)</small></em></a></p>" +
                "<p>Enter your query in the box below: " +
                  "<form><input type=\"text\" name=\"q\" />" +
                    "<input type=\"submit\">" +
                  "</form>" +
                "</p>");
    }
    
}
