package org.xlw.common.web.config;

import lombok.Data;
import org.xlw.common.nacos.annotations.Bind;
import org.xlw.common.nacos.annotations.NacosConfigClass;

/**
 * Description: check_yo
 * Author: erwan_check
 * Email: 1076360205@qq.com
 * Date: 2023/6/13 09:53
 */
@Data
@NacosConfigClass
public class NacosBusinessConfig {

    private String descConfig;

    private Boolean boolConfig;

    private String yyy;

    @Bind(dataId = "erwan.test", group = "DEFAULT_GROUP")
    public static NacosBusinessConfig instance = new NacosBusinessConfig();

    public static NacosBusinessConfig getInstance() {
        return instance;
    }
}
