package test.test;

import k.Application;
import k.config.InfoConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by ykk on 2017/3/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest("server.port:8888")
public class ControllerTest {
    @Autowired
    private WebApplicationContext context;
    private MockMvc mockMvc;
    private RestTemplate restTemplate = new TestRestTemplate();
    @Before
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }


    @InfoConfig("测试获取分类信息的xml")
    @Test
    public void checkXML() throws Exception {

        // 1. get 请求
        //MockHttpServletRequestBuilder.accept方法是设置客户端可识别的内容类型
        //MockHttpServletRequestBuilder.contentType,设置请求头中的Content-Type字段,表示请求体的内容类型
        /* mockMvc.perform(get("/role/findOne?id=02D0B35072534D1A9CD71440AA1E8314")
                .accept(MediaType.APPLICATION_JSON_UTF8))

                .andExpect(status().isOk());
               .andExpect(content().string(containsString("中文测试")))
                .andExpect(jsonPath("$.name").value("中文测试"));*/


        // 2. post 请求
        RequestBuilder request = null;
        request = post("/apis/metaweblog");
        mockMvc.perform(request)
                .andExpect(status()
                        .isOk())
                .andDo(print())
                .andExpect(content().string(equalTo("success")));
    }
}
