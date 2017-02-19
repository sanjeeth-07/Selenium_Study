public static void click(WebDriver driver, By by) {
    (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(by));
    
