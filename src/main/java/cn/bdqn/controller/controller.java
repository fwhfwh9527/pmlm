package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//           <html xmlns:th="http://www.thymeleaf.org">
//           <header th:include="head::header"></header>
//          <footer th:include="footer::footer"></footer>
@Controller
public class controller {

    //主页
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    //登录
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    //注册
    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    //商品查询出来的列表
    @RequestMapping("/shoplist")
    public String shoplist() {
        return "shoplist";
    }

    //论坛
    @RequestMapping("/blog_list_sidebar")
    public String blog_list_sidebar() {
        return "blog_list_sidebar";
    }

    //商品详情页
    @RequestMapping("/shop_detail")
    public String shop_detail() {
        return "shop_detail";
    }


//    //商品详情页
//    @RequestMapping("/shop_detail_fullwidth")
//    public  String shop_detail_fullwidth(){
//        return "shop_detail_fullwidth";
//    }

    //帖子详细页
    @RequestMapping("/blog_detail_sidebar")
    public String blog_detail_sidebar() {
        return "blog_detail_sidebar";
    }

    //关于我们
    @RequestMapping("/about_us")
    public String about_us() {
        return "about_us";
    }

    //购物车
    @RequestMapping("/shop_cart")
    public String shop_cart() {
        return "shop_cart";
    }

    //填写收货地址
    @RequestMapping("/shop_checkout")
    public String shop_checkout() {
        return "shop_checkout";
    }

    //订单完成页
    @RequestMapping("/shopover")
    public String shopover() {
        return "shopover";
    }


    //找回密码页
    @RequestMapping("/forgetpwd")
    public String forgetpwd() {
        return "forgetpwd";
    }


    //找回密码页
    @RequestMapping("/forum")
    public String forum() {
        return "forum";
    }
}
