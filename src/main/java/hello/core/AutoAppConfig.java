package hello.core;

import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(
//        basePackages = "hello.core.member",
//        basePackageClasses = AutoAppConfig.class,
        // 지정안하면 같은 패키지내에서 함
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    @Bean(name = "memoryMemberRepository")
    MemoryMemberRepository memoryMemberRepository() {
        return new MemoryMemberRepository();
    }
}
