
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Google extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.google.com")
		.inferHtmlResources()

	val headers_4 = Map(
		"DNT" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

	val headers_5 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "max-age=0",
		"dnt" -> "1",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36",
		"x-client-data" -> "CJe2yQEIorbJAQjBtskBCKmdygEIqKPKAQi/p8oBCOKoygEYsJjKARj5pcoB")

	val headers_6 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "text/plain;charset=UTF-8",
		"dnt" -> "1",
		"origin" -> "https://www.google.com",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36",
		"x-client-data" -> "CJe2yQEIorbJAQjBtskBCKmdygEIqKPKAQi/p8oBCOKoygEYsJjKARj5pcoB")

	val headers_11 = Map(
		"DNT" -> "1",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

	val headers_13 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"dnt" -> "1",
		"if-modified-since" -> "Thu, 08 Dec 2016 01:00:57 GMT",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36",
		"x-client-data" -> "CJe2yQEIorbJAQjBtskBCKmdygEIqKPKAQi/p8oBCOKoygEYsJjKARj5pcoB")

	val headers_15 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"dnt" -> "1",
		"pragma" -> "no-cache",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36",
		"x-client-data" -> "CJe2yQEIorbJAQjBtskBCKmdygEIqKPKAQi/p8oBCOKoygEYsJjKARj5pcoB")

	val headers_17 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"dnt" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36",
		"x-client-data" -> "CJe2yQEIorbJAQjBtskBCKmdygEIqKPKAQi/p8oBCOKoygEYsJjKARj5pcoB",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_18 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"dnt" -> "1",
		"origin" -> "https://www.google.com",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36",
		"x-client-data" -> "CJe2yQEIorbJAQjBtskBCKmdygEIqKPKAQi/p8oBCOKoygEYsJjKARj5pcoB")

	val headers_19 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"dnt" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36",
		"x-client-data" -> "CJe2yQEIorbJAQjBtskBCKmdygEIqKPKAQi/p8oBCOKoygEYsJjKARj5pcoB")

	val headers_20 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"dnt" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36",
		"x-chrome-connected" -> "mode=0,enable_account_consistency=false",
		"x-chrome-id-consistency-request" -> "version=1,client_id=77185425430.apps.googleusercontent.com,device_id=af1a424e-d962-4d3c-b462-d34b1ac53b04,sync_account_id=113575915123920726387,signin_mode=all_accounts,signout_mode=show_confirmation",
		"x-client-data" -> "CJe2yQEIorbJAQjBtskBCKmdygEIqKPKAQi/p8oBCOKoygEYsJjKARj5pcoB")

	val headers_21 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"dnt" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36",
		"x-client-data" -> "CJe2yQEIorbJAQjBtskBCKmdygEIqKPKAQi/p8oBCOKoygEYsJjKARj5pcoB")

	val headers_27 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"dnt" -> "1",
		"if-none-match" -> "0a58b21de6af7acea47c93bb50389ee4",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36",
		"x-client-data" -> "CJe2yQEIorbJAQjBtskBCKmdygEIqKPKAQi/p8oBCOKoygEYsJjKARj5pcoB")

	val headers_30 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"dnt" -> "1",
		"origin" -> "https://notifications.google.com",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36",
		"x-client-data" -> "CJe2yQEIorbJAQjBtskBCKmdygEIqKPKAQi/p8oBCOKoygEYsJjKARj5pcoB")

    val uri01 = "https://accounts.google.com/ServiceLogin"
    val uri02 = "https://play.google.com/log"
    val uri03 = "https://notifications.google.com/_/scs/social-static/_/js/k=boq.NotificationsOgbUi.en.OQzP_H_m9do.O"
    val uri04 = "https://ogs.google.com/u/0/_/notifications/count"
    val uri06 = "https://adservice.google.com/adsid/google/ui"
    val uri07 = "https://clients5.google.com/pagead/drt"
    val uri08 = "https://www.gstatic.com"
    val uri09 = "https://apis.google.com"
    val uri10 = "https://lh3.googleusercontent.com/-neA5GaFxXCM/AAAAAAAAAAI/AAAAAAAAAAA/AKxrwcZaF_U4OWgylMjb2S4Sd_bsU2hfng/s32-c-mo/photo.jpg"
    val uri11 = "https://ssl.gstatic.com/gb/images/i1_1967ca6a.png"

	val scn = scenario("Google")
		.exec(http("request_0")
			.get("/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png")
			.resources(http("request_1")
			.get(uri08 + "/images/branding/googlemic/2x/googlemic_color_24dp.png"),
            http("request_2")
			.get(uri10 + ""),
            http("request_3")
			.get(uri11 + ""),
            http("request_4")
			.get("/xjs/_/js/k=xjs.s.en.o7-j2t2yx9g.O/m=sx,Fkg7bd,HcFEGb,IvlUe,MC8mtf,OF7gzc,RMhBfe,T4BAC,TJw5qb,TbaHGc,Y33vzc,cdos,hsm,iDPoPb,jsa,mvYTse,tg8oTe,uz938c,vWNDde,ws9Tlc,xpltpb,yQ43ff,d,csi/am=DAAWYf8Hyf8vAKAAELgKbLBABolBPQE/rt=j/d=1/dg=2/rs=ACT90oHfp7j9LdYNOTrxqg2CNIvnxQDlJA")
			.headers(headers_4),
            http("request_5")
			.get("/")
			.headers(headers_5),
            http("request_6")
			.post("/gen_204?s=webhp&t=aft&atyp=csi&ei=uokaXKCoBsXkvAT166ywDQ&rt=wsrt.254,aft.300,prt.300")
			.headers(headers_6),
            http("request_7")
			.post("/gen_204?atyp=csi&ei=uokaXKCoBsXkvAT166ywDQ&s=jsa&jsi=s,t.0,et.focus,n.iDPoPb,cn.1&zx=1545243065639")
			.headers(headers_6),
            http("request_8")
			.get("/xjs/_/js/k=xjs.s.en.o7-j2t2yx9g.O/am=DAAWYf8Hyf8vAKAAELgKbLBABolBPQE/rt=j/d=1/exm=sx,Fkg7bd,HcFEGb,IvlUe,MC8mtf,OF7gzc,RMhBfe,T4BAC,TJw5qb,TbaHGc,Y33vzc,cdos,hsm,iDPoPb,jsa,mvYTse,tg8oTe,uz938c,vWNDde,ws9Tlc,xpltpb,yQ43ff,d,csi/ed=1/dg=2/rs=ACT90oHfp7j9LdYNOTrxqg2CNIvnxQDlJA/m=sb_wiz,aa,abd,async,dvl,foot,ipv6,lu,m,mu,sf,sonic,spch,xz7cCd,fEVMic,WgDvvc?xjs=s1")
			.headers(headers_4),
            http("request_9")
			.get("/images/nav_logo242.png")
			.headers(headers_4),
            http("request_10")
			.get(uri08 + "/og/_/js/k=og.og2.en_US.ATZQdPfr-RM.O/rt=j/m=drt,def/exm=in,fot/d=1/ed=1/rs=AA2YrTv-X7m9A6GmnfpSsKdPIfvIYg06ZQ")
			.headers(headers_4),
            http("request_11")
			.get(uri07 + "/dn/")
			.headers(headers_11),
            http("request_12")
			.get(uri09 + "/_/scs/abc-static/_/js/k=gapi.gapi.en.FG3dTgKD_wc.O/m=gapi_iframes,googleapis_client,iframes_styles_slide_menu,plusone/rt=j/sv=1/d=1/ed=1/rs=AHpOoo_ZNd1Q_9wfB-oUWsMjMFF_7HQbqA/cb=gapi.loaded_0")
			.headers(headers_4),
            http("request_13")
			.get(uri07 + "/dn/dn.js")
			.headers(headers_13),
            http("request_14")
			.get(uri06 + "")
			.headers(headers_4),
            http("request_15")
			.get("/favicon.ico")
			.headers(headers_15),
            http("request_16")
			.post("/gen_204?atyp=csi&ei=uokaXKCoBsXkvAT166ywDQ&s=webhp&t=all&imn=3&adh=&conn=onchange&ima=1&ime=1&imeb=0&imeo=0&mem=ujhs.22,tjhs.32,jhsl.2218,dm.8&net=dl.10000,ect.4g,rtt.0&sys=hc.4&rt=aft.300,dcl.308,ol.1207,prt.300,xjs.245,xjsee.244,xjses.152,xjsls.68,wsrt.254,cst.0,dnst.0,rqst.421,rspt.242,rqstt.15,unt.1,cstt.1,dit.561&zx=1545243066519")
			.headers(headers_6),
            http("request_17")
			.get(uri07 + "/ne?di=%5B%2220140509-01%22%2C263%2C0%2C2516%5D")
			.headers(headers_17),
            http("request_18")
			.post(uri04 + "")
			.headers(headers_18)
			.formParam("ntok", "AG-9E3d4zoy__uzqBcfVTeMxGQDRd6vxfzt-uGMDO5Dq_-JLN2ZQDx1EzaNEhCMXcu89lQLFsah93drWM6mVWmLSPWCZjMhhJg"),
            http("request_19")
			.get("/pagead/drt/ui?ogt=1")
			.headers(headers_19),
            http("request_20")
			.get(uri01 + "?service=doritos&passive=true&go=true&continue=https://googleads.g.doubleclick.net/pagead/drt/si%3Fogt%3D1")
			.headers(headers_20),
            http("request_21")
			.get(uri03 + "/am=AAAAgA/rt=j/d=1/excm=home,_b,_tp/ed=1/dg=0/rs=AGLTcCPtisAIZnH6m7ksQAoCqsbr5ivhJw/m=_b,_tp")
			.headers(headers_21),
            http("request_22")
			.get(uri03 + "/ck=boq.NotificationsOgbUi.H0mL5kNY93c.L.W.O/am=AAAAgA/rt=j/d=1/exm=OJUrvb,_b,_tp,wmwg8b/excm=home,_b,_tp/ed=1/rs=AGLTcCOjoZ-UwwSRShI1-T5CVoBKuG6RvQ/m=CyO4we,EFQ78c,G4es5d,GkRiKb,IZT63,L1AAkb,LUjVKc,LbJKvc,MI6k7c,MJAy1b,MdUzUe,O6y8ed,PrPYRd,RQErad,SdcwHb,SpsfSb,Uas9Hd,WO9ee,XAzchc,XVMNvd,XbSRYb,aW3pY,azoZEe,bvGsFe,dodICd,e5qFLc,hKSk3e,hc6Ubd,iWP1Yb,kjKdXe,lwddkf,mI3LFb,mdR7q,o02Jie,o7nxec,rHjpXd,wI7Sfc,ws9Tlc,xQtZb,zbML3c")
			.headers(headers_21),
            http("request_23")
			.get(uri03 + "/ck=boq.NotificationsOgbUi.H0mL5kNY93c.L.W.O/am=AAAAgA/rt=j/d=1/exm=_b,_tp,wmwg8b/excm=home,_b,_tp/ed=1/rs=AGLTcCOjoZ-UwwSRShI1-T5CVoBKuG6RvQ/m=OJUrvb")
			.headers(headers_21),
            http("request_24")
			.get(uri03 + "/ck=boq.NotificationsOgbUi.H0mL5kNY93c.L.W.O/am=AAAAgA/rt=j/d=1/exm=_b,_tp/excm=home,_b,_tp/ed=1/rs=AGLTcCOjoZ-UwwSRShI1-T5CVoBKuG6RvQ/m=wmwg8b")
			.headers(headers_21),
            http("request_25")
			.get(uri03 + "/ck=boq.NotificationsOgbUi.H0mL5kNY93c.L.W.O/am=AAAAgA/rt=j/d=1/exm=CyO4we,EFQ78c,G4es5d,GkRiKb,IZT63,L1AAkb,LUjVKc,LbJKvc,MI6k7c,MJAy1b,MdUzUe,NTMZac,O6y8ed,OJUrvb,PrPYRd,RQErad,SKR2De,SdcwHb,SpsfSb,Uas9Hd,WO9ee,XAzchc,XVMNvd,XbSRYb,_b,_tp,aW3pY,azoZEe,bvGsFe,dodICd,e5qFLc,hKSk3e,hc6Ubd,iWP1Yb,kjKdXe,lwddkf,mI3LFb,mdR7q,o02Jie,o7nxec,rHjpXd,wI7Sfc,wmwg8b,ws9Tlc,xQtZb,zbML3c/excm=home,_b,_tp/ed=1/rs=AGLTcCOjoZ-UwwSRShI1-T5CVoBKuG6RvQ/m=ZxDaqc,w9hDv")
			.headers(headers_21),
            http("request_26")
			.get(uri03 + "/ck=boq.NotificationsOgbUi.H0mL5kNY93c.L.W.O/am=AAAAgA/rt=j/d=1/exm=CyO4we,EFQ78c,G4es5d,GkRiKb,IZT63,L1AAkb,LUjVKc,LbJKvc,MI6k7c,MJAy1b,MdUzUe,O6y8ed,OJUrvb,PrPYRd,RQErad,SdcwHb,SpsfSb,Uas9Hd,WO9ee,XAzchc,XVMNvd,XbSRYb,_b,_tp,aW3pY,azoZEe,bvGsFe,dodICd,e5qFLc,hKSk3e,hc6Ubd,iWP1Yb,kjKdXe,lwddkf,mI3LFb,mdR7q,o02Jie,o7nxec,rHjpXd,wI7Sfc,wmwg8b,ws9Tlc,xQtZb,zbML3c/excm=home,_b,_tp/ed=1/rs=AGLTcCOjoZ-UwwSRShI1-T5CVoBKuG6RvQ/m=NTMZac,SKR2De")
			.headers(headers_21),
            http("request_27")
			.get(uri09 + "/js/api.js")
			.headers(headers_27),
            http("request_28")
			.get(uri09 + "/_/scs/abc-static/_/js/k=gapi.gapi.en.FG3dTgKD_wc.O/m=gapi_iframes_simple/rt=j/sv=1/d=1/ed=1/rs=AHpOoo_ZNd1Q_9wfB-oUWsMjMFF_7HQbqA/cb=gapi.loaded_0")
			.headers(headers_21),
            http("request_29")
			.get(uri03 + "/ck=boq.NotificationsOgbUi.H0mL5kNY93c.L.W.O/am=AAAAgA/rt=j/d=1/exm=CyO4we,EFQ78c,G4es5d,GkRiKb,IZT63,L1AAkb,LUjVKc,LbJKvc,MI6k7c,MJAy1b,MdUzUe,NTMZac,O6y8ed,OJUrvb,PrPYRd,RQErad,SKR2De,SdcwHb,SpsfSb,Uas9Hd,WO9ee,XAzchc,XVMNvd,XbSRYb,ZxDaqc,_b,_tp,aW3pY,azoZEe,bvGsFe,dodICd,e5qFLc,hKSk3e,hc6Ubd,iWP1Yb,kjKdXe,lwddkf,mI3LFb,mdR7q,o02Jie,o7nxec,rHjpXd,w9hDv,wI7Sfc,wmwg8b,ws9Tlc,xQtZb,zbML3c/excm=home,_b,_tp/ed=1/rs=AGLTcCOjoZ-UwwSRShI1-T5CVoBKuG6RvQ/m=FCpbqb,WhJNk,_latency")
			.headers(headers_21),
            http("request_30")
			.post(uri02 + "?format=json&hasfast=true")
			.headers(headers_30)
			.formParam("""[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,"en",null,"boq_notificationsuiserver_20181216.03_p0"]],241,[["1545243072793",null,[],null,null,null,null,"[1545243071951,[[\"2397168675742140944\",null,[[214,1]]],[\"16147638372540442232\",null,[[403,1]]],[\"14719340685975485085\",null,[[459,1]]],[\"17077408715954654437\",null,[[1726,1]]],[\"5790177495296899286\",null,[[0,1]]],[\"16829267986558572790\",null,[[0,1]]],[\"16339156775003354937\",null,[[111,1]]],[\"749851692583976763\",null,[[240,1]]],[\"15419336178855610526\",null,[[159,1]]],[\"17276521865292187132\",null,[[1,1]]],[\"8257051839445688306\",null,[[1725,1]]],[\"7792735449360349632\",null,[[1726,1]]],[\"7094487270460551484\",null,[[8,1]]],[\"12563104964214410683\",null,[[1517,1]]],[\"15605813632677093659\",null,[[336,1]]],[\"17914751415692637656\",null,[[1,1]]],[\"9797767207516844257\",null,[[0,1]]],[\"14906952326733574741\",null,[[0,1]]],[\"6667106912793420619\",null,[[0,1]]],[\"10118692516388306266\",null,[[0,1]]],[\"6342145065879578001\",null,[[8,1]]],[\"13596961294000664596\",null,[[1517,1]]],[\"2107494750385856652\",null,[[336,1]]],[\"1309831198388189068\",null,[[1,1]]],[\"4950535922500196698\",null,[[2115,1]]],[\"1757184925777806825\",null,[[31,1]]],[\"3079121564595244695\",null,[[18,1]]]],null,null,\"[1,\\\"jasHAe_PL\\\"]\"]",null,null,null,1565282669,null,null,null,[null,[],null,"[[],[],[1709118],[]]"],null,null,null,[],1,null,null,null,null,null,[]]],"1545243072793",[],null,null,null,null,null,null,null,null,0]""", "")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}