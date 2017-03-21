package k.config;

import java.lang.annotation.*;

/**
 * Created by ykk on 2017/3/21.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InfoConfig {
    String value() default "none";
}