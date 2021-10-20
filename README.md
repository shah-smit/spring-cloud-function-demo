### Spring Cloud Function Practice ###


Practice from Thomas Vitale [Course](https://learning.oreilly.com/videos/event-driven-with-spring/10000MNLV2021128/)


#### Useful Commands

- To Build GraalVM Image 
```bash
 mvn spring-boot:build-image 
```

- To Curl Locally
```bash
curl -H "Content-Type:plain/text" localhost:8080 -d helloworld
```

The above will output `DLROWOLLEH` as the default endpoint exposed will give `uppercase|reverse`

- To Curl Specific Functions
```bash
curl -H "Content-Type:plain/text" localhost:8080/uppercase -d helloworld
```

- To Curl Specific Functions
```bash
curl -H "Content-Type:plain/text" localhost:8080/reverse -d helloworld
```

#### References:

- [Github](https://github.com/ThomasVitale/spring-cloud-function-stream-webinar-apr-2021)