const baseUrl = 'http://manage.leyou.com'
const config = {
  locale: 'zh-CN', // en-US, zh-CN
  url: baseUrl,
  debug: {
    http: false // http request log
  },
  sys: `${baseUrl}/sys`,
}

export default config
