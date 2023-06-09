در این گزارش چندین ابزار برای مدیریت درخواست‌ها، حوادث و مشکلات، نحوه کنترل وضعیت و پایش محیط عملیاتی و مدیریت دانش معرفی می‌شوند. ابزارهایی که در این گزارش بررسی می‌شوند عبارتند از:

- Jira
- Promotheus
- Grafana
- Confluence

## ابزار Confluence
<div dir="rtl">
این ابزار برای مدیریت دانش استفاده می‌شود. در این ابزار می‌توان spaceهای متفاوت ایجاد کرد و در هرکدام مستندات کافی به همراه تصویر قرار داد.
نمای کلی سامانه به صورت زیر است:

![Main Dashboard](static/c1.png)

می‌توان اسپیس‌های مختلف ساخت و در آن‌ها عضو شد و سطح دسترسی تعریف کرد:

![Main Dashboard](static/c2.png)

در هر اسپیس، مستندات به صورت جدول موضوعات تودرتو تعریف می‌شوند:

![Main Dashboard](static/c3.png)

در هر یک از مستندات، می‌توان به هر شکلی که نیاز است به توسعه‌ی مستند پرداخت:

![Main Dashboard](static/c4.png)

در بخش کامنت‌ها، افراد سازمان می‌توانند به پرسش و پاسخ حول موضوع بپردازند:

![Main Dashboard](static/c5.png)

</div>

## ابزار promotheus
<div dir="rtl">
این ابزار برای مدیریت، نظارت و الرتینگ سامانه‌های نرم‌افزاری استفاده می‌شود. این ابزار به کمک یک http request که از سمت سامانه‌ها به آن ارسال می‌شود، به ما کمک می‌کند که سلامت سرویس‌ها را رصد کنیم.

در این ابزار می‌توان الرت‌های گوناگون ایجاد کرد:

![Main Dashboard](static/p1.png)

این ابزار ruleهای متفاوتی برای هر ابزار دارد. برای مثال اگر به مدت ۲۰ ثانیه از یک سرویس پاسخی دریافت نشود، می‌توان آن سرویس را ناکارآمد در نظر گرفت و الرت ارسال کرد:

![Main Dashboard](static/p2.png)

در این ابزار می‌توان دسته‌بندی‌های مختلف ایجاد کرد و تمام سامانه‌های هم‌دسته را به صورت مرتب نظاره کرد:

![Main Dashboard](static/p3.png)

ابزار promotheus pushgateway به ما کمک می‌کند الرت‌های تعریف شده، به هرجا که نیاز است ارسال شود. مانند ایمیل، بات، یا هرجایی که برای رصد سرویس‌ها مد نظر است:

![Main Dashboard](static/p4.png)

نمونه‌ی الرت ارسال شده توسط بات اسلک:

![Main Dashboard](static/p5.png)
</div>

## ابزار grafana
<div dir="rtl">
این ابزار به ما کمک می‌کند دشبوردهای متفاوتی بسازیم و گراف‌های مرتبط با عملکرد سیستم‌ها را به صورت انواع نمودار به ما نشان می‌دهد

در این ابزار می‌توان گروه‌هایی مرتبط با هر نوع سرویس ایجاد کرد:

![Main Dashboard](static/g1.png)

در هر گروه، می‌توان دشبوردهای مرتبط با هر نوع نظارتی که نیاز است پیاده کرد. برای مثال پایش سرورها، شبکه و ...

![Main Dashboard](static/g2.png)

در هر دشبورد هر نوع نموداری که نیاز باشد می‌توان پیاده کرد. اطلاعات این نمودارها، توسط ابزارهایی تحت عنوان exporter به promotheus ارسال می‌شوند و گرافانا دیتا را از آنجا می‌خواند:

![Main Dashboard](static/g3.png)

برای هر نمودار، می‌توان کوئری‌ای با ویژگی‌های مختلف تعریف کرد. کوئری مرتبط با یک نمودار در پایین عکس قابل مشاهده است:

![Main Dashboard](static/g4.png)

نمونه‌ی ایراد رصد شده توسط ابزار گرافانا. در این تصویر مقدار پیام‌های ورودی به ابزار apache kafka رصد می‌شود که حوالی ۳ صبح دچار اختلال شده‌اند:

![Main Dashboard](static/g5.png)
</div>


## ابزار Jira
<div dir="rtl">
این ابزار برای مدیریت درخواست‌ها و ایرادات استفاده می‌شود. در این ابزار می‌توان برای هر مشکل یا درخواست، یک تیکت تولید کرد و آن را به فردی تخصیص داد. آن فرد وظیفه دارد که آن موضوع را پیگیری کند و در صورت لزوم تیکت را به افراد دیگری تخصیص دهد. به این صورت این ابزار می‌تواند به ما کمک کند تمامی درخواست‌ها را رصد کنیم و به طور ساماندهی‌شده به درخواست‌ها و مشکلات پاسخ دهیم.

در این ابزار می‌توان اسپیس‌های مختلف مرتبط با مسائل گوناگون ایجاد کرد. برای مثال تمام مسائل زیرساختی در یک اسپیس قرار بگیرند و اعضای تیم زیرساخت عضو آن باشند:

![Main Dashboard](static/J1.png)

نمونه‌ی یک تیکت در این عکس قابل مشاهده است. در این سامانه قابلیت تعیین اولویت، توضیح مشکل، تخصیص به افراد مختلف وجود دارد. در سمت راست تصویر افراد مختلفی که به این تیکت تخصیص داده شده‌اند قابل مشاهده است:

![Main Dashboard](static/J2.png)

تمامی تیکت‌های هر اسپیس، با هر دسته‌بندی که نیاز است قابلیت دسته‌بندی دارند. برای مثال در تصویر زیر تیکت‌های یک اسپرینت در یک دسته‌بندی قرار گرفته‌اند:

![Main Dashboard](static/J3.png)

در هر تیکت می‌توان مهارت‌های مورد نیاز برای رفع مشکل را ثبت کرد تا تیکت به فردی که تخصص مربوطه را ندارد تخصیص داده نشود یا کسی که تخصص ندارد خودش تیکت را برای انجام انتخاب نکند. این کار به مدیریت زمان کمک می‌کند:

![Main Dashboard](static/J4.png)

تمامی پیگیری‌ها و اتفاق‌هایی که از زمان ایجاد تیکت رخ داده، به صورت مستند در زیر هر تیکت مشخص است. در نتیجه جریان کاری هر تیکت کاملا قابل رصد است:

![Main Dashboard](static/J5.png)
</div>