package com.cruse.enjoylife.bean;

import java.util.List;

/**
 * Created by lulanqin on 2017/5/13.
 */
public class WXNewsBean {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-05-13","title":"她在水里倒了几滴这个，家具上再没灰尘！很多人不知道！","description":"三亚潮生活","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-13218154.static/640","url":"http://mp.weixin.qq.com/s?__biz=MzAwNzc0OTQ4Mw==&idx=4&mid=2649855105&sn=14167d91e2558e174fc271b99cdd3e5c"},{"ctime":"2017-05-13","title":"发芽的大蒜是个宝，它有4种神奇效果！","description":"三亚潮生活","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-13218154.static/640","url":"http://mp.weixin.qq.com/s?__biz=MzAwNzc0OTQ4Mw==&idx=3&mid=2649855105&sn=c3aba6928cb7956f8f08bda53343cfc6"},{"ctime":"2017-05-13","title":"当过小偷、捡过垃圾的地痞太妹，如今逆袭成亿万富婆！","description":"环球人物杂志","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-22344111.jpg/640","url":"http://mp.weixin.qq.com/s?__biz=MTAzNDI4MDc2MQ==&idx=2&mid=2651656199&sn=56006a806f7d324d40bde1c1891733b2"},{"ctime":"2017-05-13","title":"欧阳奋强：晓旭，想你\u2026\u2026","description":"环球人物杂志","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-23609417.jpg/640","url":"http://mp.weixin.qq.com/s?__biz=MTAzNDI4MDc2MQ==&idx=1&mid=2651656199&sn=e6a41b0f43847b1fc8e33ffa05461499"},{"ctime":"2017-05-13","title":"厉害！五月起三亚又多了5个霸气的新名字！最后一个性感又霸气！","description":"三亚潮生活","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-13218154.static/640","url":"http://mp.weixin.qq.com/s?__biz=MzAwNzc0OTQ4Mw==&idx=1&mid=2649855105&sn=9ab2fc7c5bdb8241bf2f8e230d98afe2"},{"ctime":"2017-05-13","title":"她85岁文眉贴面膜，独自一人玩遍台湾和香港，活得比18岁的姑娘还要年轻漂亮","description":"环球人物杂志","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-21485888.jpg/640","url":"http://mp.weixin.qq.com/s?__biz=MTAzNDI4MDc2MQ==&idx=3&mid=2651656199&sn=dc7e0bc7c5f6c15d48a271dc2cf4d6fd"},{"ctime":"2017-05-13","title":"孝感这家鱼店老板太任性了！6元让你吃到饱，参与就送\u2026\u2026","description":"孝感晚报","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-23609440.jpg/640","url":"http://mp.weixin.qq.com/s?__biz=MjM5ODc4NDQ4OQ==&idx=1&mid=2650430995&sn=67ceb31549ef26d6e3834b54f63fba97"},{"ctime":"2017-05-13","title":"孝感工业学校这场活动，让众多学生、家长泪奔\u2026\u2026","description":"孝感晚报","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-23609462.jpg/640","url":"http://mp.weixin.qq.com/s?__biz=MjM5ODc4NDQ4OQ==&idx=3&mid=2650430995&sn=331f5de7ec98e0781b232884238ad581"},{"ctime":"2017-05-13","title":"达州罗浮广场在5月20日晚上，将要撒出一大捧狗粮","description":"达州生活圈圈","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18312371.static/640","url":"http://mp.weixin.qq.com/s?__biz=MzIxMzQ1NzQzMA==&idx=1&mid=2247487123&sn=d59685d56a981c965d2c633263c6e55e"},{"ctime":"2017-05-13","title":"先锋悦读丨不要让一时的失落，剥夺你成为英雄的可能","description":"云岭先锋","picUrl":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-23609354.jpg/640","url":"http://mp.weixin.qq.com/s?__biz=MzAxMjAyODcwMw==&idx=8&mid=2650840460&sn=66698962579a7e448a37d0d8c53fa491"}]
     */

    private int code;
    private String msg;
    /**
     * ctime : 2017-05-13
     * title : 她在水里倒了几滴这个，家具上再没灰尘！很多人不知道！
     * description : 三亚潮生活
     * picUrl : http://zxpic.gtimg.com/infonew/0/wechat_pics_-13218154.static/640
     * url : http://mp.weixin.qq.com/s?__biz=MzAwNzc0OTQ4Mw==&idx=4&mid=2649855105&sn=14167d91e2558e174fc271b99cdd3e5c
     */

    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
