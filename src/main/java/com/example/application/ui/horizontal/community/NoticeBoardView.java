package com.example.application.ui.horizontal.community;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.ui.MainView;

@Route(value = "SchwarzesBrett", layout = MainView.class)
@PageTitle("Schwarzes Brett")
public class NoticeBoardView extends Div {

    public NoticeBoardView() {
        setId("noticeBoard-view");
        add(new Text("Schwarzes Brett"));
    }

}
