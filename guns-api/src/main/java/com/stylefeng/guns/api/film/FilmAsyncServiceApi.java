package com.stylefeng.guns.api.film;

import com.stylefeng.guns.api.film.vo.ActorVO;
import com.stylefeng.guns.api.film.vo.FilmDescVO;
import com.stylefeng.guns.api.film.vo.ImgVO;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2020/6/28 1:07 上午
 */
public interface FilmAsyncServiceApi {

    /**
     * 获取影片描述信息
     */
    FilmDescVO getFilmDesc(String filmId);

    ImgVO getImgs(String filmId);

    /**
     * 获取导演信息
     */
    ActorVO getDictInfo(String filmId);

    /**
     * 获取演员信息
     */
    List<ActorVO> getActors(String filmId);
}
