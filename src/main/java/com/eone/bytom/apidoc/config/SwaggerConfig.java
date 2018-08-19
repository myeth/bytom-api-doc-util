package com.eone.bytom.apidoc.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by zileanj
 */
@Component
@EnableSwagger2
@ComponentScan(basePackages = {"com.eone.bytom.apidoc.rest"})
@Configuration
public class SwaggerConfig extends WebMvcConfigurationSupport {


    @Bean
    public Docket CreateRestApi()  {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.eone.bytom.apidoc.rest"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("bytom apiserver doc")
                .description("doc for bytom apiserver" +
                        "0XX API错误\n" +
                        "\n" +
                        "BTM000\", \"Bytom API Error\" 非比原标准错误\n" +
                        "\n" +
                        "BTM001\", \"Request timed out\" API请求超时\n" +
                        "\n" +
                        "BTM002\", \"Invalid request body\" 非法的API请求体\n" +
                        "\n" +
                        "1XX为网络错误\n" +
                        "\n" +
                        "BTM103\", \"A peer core is operating on a different blockchain network\" 区块链网络类型不匹配\n" +
                        "\n" +
                        "2xx是签名相关的错误\n" +
                        "\n" +
                        "BTM200 ：\"Quorum must be greater than 1 and less than or equal to the length of xpubs“\n" +
                        "需要签名的个数超过实际需求签名的个数\n" +
                        "\n" +
                        "BTM201 ：”Invalid xpub format\" 签名格式错误\n" +
                        "\n" +
                        "BTM202 ：\"At least one xpub is required\" 缺少主公钥\n" +
                        "\n" +
                        "BTM204 ： \"Root XPubs cannot contain the same key more than once\" 主公钥重复\n" +
                        "\n" +
                        "7XX为交易相关的错误\n" +
                        "\n" +
                        "72X - 73X 构建交易错误\n" +
                        "\n" +
                        "BTM700 ： \"Funds of account are insufficient\" 资产余额不足\n" +
                        "\n" +
                        "BTM701 ： \"Available funds of account are immature\" coinbase交易未成熟，币不可花费\n" +
                        "\n" +
                        "BTM702 ： \"Available UTXOs of account have been reserved 资产被锁定五分钟，不可花费（一般密码输入错误会产生）\n" +
                        "\n" +
                        "BTM703 ： \"Not found UTXO with given hash\" UTXO不属于当前钱包\n" +
                        "\n" +
                        "BTM704 ： \"Invalid action type\" action类型不存在\n" +
                        "\n" +
                        "BTM705 ： \"Invalid action object\" action输入内容错误\n" +
                        "\n" +
                        "BTM706 ： \"Invalid action construction\" action结构错误（只有输入或者只有输出）\n" +
                        "\n" +
                        "BTM707 ： \"One or more fields are missing\" action输入内容缺失\n" +
                        "\n" +
                        "BTM708 ： \"Invalid asset amount\" 资产数量格式错误（超过最大数量）\n" +
                        "\n" +
                        "BTM709 ： \"Not found account\" 账户不存在\n" +
                        "\n" +
                        "BTM710 ： \"Not found asset\" 资产不存在\n" +
                        "\n" +
                        "73X - 75X 验证交易错误\n" +
                        "\n" +
                        "BTM730 ：\"Invalid transaction version\" 交易版本不对\n" +
                        "\n" +
                        "BTM731 ：\"Invalid transaction size\" 交易大小不能为0\n" +
                        "\n" +
                        "BTM732 ：\"Invalid transaction time range\" 超出交易时间范围，用于将停留时间过久的未确认交易作废\n" +
                        "\n" +
                        "BTM733 ： \"Not standard transaction\" 不是标准的交易，使用合约地址接受BTM时报错\n" +
                        "\n" +
                        "BTM734 ： \"Invalid coinbase transaction\" 非法coinbase交易\n" +
                        "\n" +
                        "BTM735 ： \"Invalid coinbase assetID\" 非法的coinbase资产ID\n" +
                        "\n" +
                        "BTM736 ： \"Invalid coinbase arbitrary size\" coinbase尺寸过大，附加数据超过一定限制\n" +
                        "\n" +
                        "BTM737 ： \"No results in the transaction\" 交易action hash缺失\n" +
                        "\n" +
                        "BTM738 ： \"Mismatched assetID\" 不匹配的资产ID，发布资产时资产ID错误\n" +
                        "\n" +
                        "BTM739 ： \"Mismatched value source/dest position\" 不匹配的action位置\n" +
                        "\n" +
                        "BTM740 ： \"Mismatched reference\" 不匹配的引用\n" +
                        "\n" +
                        "BTM741 ： \"Mismatched value\" 不匹配的值，action的资产值不匹配\n" +
                        "\n" +
                        "BTM742 ： \"Missing required field\" 不匹配的字段，action输入的资产值类型不匹配\n" +
                        "\n" +
                        "BTM743 ： \"No source for value\" 输入源不存在\n" +
                        "\n" +
                        "BTM744 ： \"Arithmetic overflow/underflow\" 计算溢出，资产计算值超出限制\n" +
                        "\n" +
                        "BTM745 ： \"Invalid source or destination position\" action位置不匹配\n" +
                        "\n" +
                        "BTM746 ： \"Unbalanced asset amount between input and output\" 输入输出非BTM资产总量不平衡\n" +
                        "\n" +
                        "BTM747 ： \"Gas credit has been spent\" UTXO数量超过上限（当前为21个）\n" +
                        "\n" +
                        "BTM748 ： \"Gas usage calculate got a math error\" Gas运算错误\n" +
                        "\n" +
                        "76X - 78X 虚拟机错误\n" +
                        "\n" +
                        "BTM760 ：\"Alt stack underflow\" 子虚拟机栈溢出\n" +
                        "\n" +
                        "BTM761 ： \"Bad value\" 非法栈数据\n" +
                        "\n" +
                        "BTM762 ： \"Wrong context\" context值错误，context为虚拟机执行上下文\n" +
                        "\n" +
                        "BTM763 ： \"Data stack underflow\" 虚拟机数据溢出\n" +
                        "\n" +
                        "BTM764 ： \"Disallowed opcode\" 虚拟机指令不存在\n" +
                        "\n" +
                        "BTM765 ： \"Division by zero\" 除零错误\n" +
                        "\n" +
                        "BTM766 ： \"False result for executing VM\" 虚拟机执行结果为Fasle\n" +
                        "\n" +
                        "BTM767 ： \"Program size exceeds max int32\" 合约的字节大小超过int32上限\n" +
                        "\n" +
                        "BTM768 ： \"Arithmetic range error\" 计算出错\n" +
                        "\n" +
                        "BTM769 ： \"RETURN executed\" 执行opfail指令返回的结果\n" +
                        "\n" +
                        "BTM770 ： \"Run limit exceeded because the BTM Fee is insufficient\" Gas费用不足，引起合约终止\n" +
                        "\n" +
                        "BTM771 ： \"Unexpected end of program\" 合约程序参数输入错误\n" +
                        "\n" +
                        "BTM772 ： \"Unrecognized token\" 不识别的虚拟机指令数据\n" +
                        "\n" +
                        "BTM773 ： \"Unexpected error\" 异常错误\n" +
                        "\n" +
                        "BTM774 ： \"Unsupported VM because the version of VM is mismatched\" 虚拟机版本不匹配\n" +
                        "\n" +
                        "BTM775 ： \"VERIFY failed\" verify指令执行失败\n" +
                        "\n" +
                        "8XX 为HSM相关错误\n" +
                        "\n" +
                        "BTM800 ：\"Key Alias already exists\" 密钥别名重复\n" +
                        "\n" +
                        "BTM801 ：\"Invalid after in query\" 此错误已废弃\n" +
                        "\n" +
                        "BTM802 ： \"Key not found or wrong password\" 密钥不存在或者密码错误\n" +
                        "\n" +
                        "BTM803 ： \"Requested key aliases exceeds limit\" 此错误已废弃\n" +
                        "\n" +
                        "BTM804 ：\"Could not decrypt key with given passphrase\" 解密流程失败\n" +
                        "\n" +
                        "BTM860\", \"Request could not be authenticated\" access token错误")
                .version("1.0.4")
                .build();
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }


}
