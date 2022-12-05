package com.zbkj.common.vo;

import lombok.Data;

import java.util.List;

/**
 * 第一级类目
 *  +----------------------------------------------------------------------
 *  | CRMEB [ CRMEB赋能开发者，助力企业发展 ]
 *  +----------------------------------------------------------------------
 *  | Copyright (c) 2016~2022 https://www.crmeb.com All rights reserved.
 *  +----------------------------------------------------------------------
 *  | Licensed CRMEB并不是自由软件，未经许可不能去掉CRMEB相关版权
 *  +----------------------------------------------------------------------
 *  | Author: CRMEB Team <admin@crmeb.com>
 *  +----------------------------------------------------------------------
 */
@Data
public class FirstCatVo {

    /** 一级类目ID */
    private Integer firstCatId;

    /** 一级类目名称 */
    private String firstCatName;

    /** 二级类目数组 */
    private List<SecondCatVo> secondCatList;

}
