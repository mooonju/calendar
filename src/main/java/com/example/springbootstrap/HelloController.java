package com.example.springbootstrap;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class HelloController {

    @GetMapping("/home")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "users/login";
    }

    @GetMapping("/join")
    public String join(Model model) {
        return "users/join";
    }

    @GetMapping("/groupjoin")
    public String groupJoin(Model model) {
        return "users/user_group";
    }

    @GetMapping("/petjoin")
    public String petJoin(Model model) {
        return "users/user_pet";
    }

    @GetMapping("/calendar")
    public String calendar(Model model) {
        return "page/calendar";
    }

    @GetMapping("/calendar2")
    public String calendar2(Model model) {
        return "page/calendar2";
    }

    @GetMapping("/calendar3")
    public String calendar3(Model model) {
        return "page/calendar3";
    }

    @GetMapping("/calendar4")
    public String calendar4(Model model) {
        return "page/calendar4";
    }

    @GetMapping("/pet")
    public String petMana(Model model) {
        return "pet/pet_manage";
    }



    /*


    private final ContentService contentService;
    private final FileStore fileStore;

    // 홈 화면
    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("contents", contentService.getAllContents());
        return "basic_board/home";
    }

    @GetMapping("/")
    public String redirectHome() {
        return "redirect:/basic-board";
    }

    // 글 쓰기 화면
    @GetMapping("/content/write")
    public String writePage() {
        return "basic_board/write-page";
    }

    // 글 쓰기
    @PostMapping("/content/write")
    public String writeContent(ContentForm form) throws IOException {
        Content content = new Content();
        content.setTitle(form.getTitle());
        content.setWriter(form.getWriter());
        content.setTexts(form.getTexts());

        LocalDateTime NowTime = LocalDateTime.now();
        String formatDate = NowTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        content.setUpdateDate(formatDate);

        // 첨부파일, 이미지들 처리하는 부분
        UploadFile attachFile = fileStore.storeFile(form.getAttachFile());
        List<UploadFile> imageFiles = fileStore.storeFiles(form.getImageFiles());
        content.setAttachFile(attachFile);
        content.setImageFiles(imageFiles);

        contentService.writeContent(content);

        return "redirect:/basic-board";
    }

    // 글 보기 화면
    @GetMapping("/content/{id}")
    public String showContent(@PathVariable int id, Model model) {
        Content content = contentService.getContent(id);

        System.out.println(content.getAttachFile().getStoreFilename());
        System.out.println(content.getAttachFile().getUploadFilename());
        model.addAttribute("content", content);
        return "basic_board/content-page";
    }

    // 글 수정
    @PostMapping("/content/{id}")
    public String editContent(@PathVariable int id, Content content) {
        System.out.println(content);
        contentService.editContent(id, content.getTexts(), content.getPassword());
        return "redirect:/basic-board";
    }

    // 글 삭제
    @PostMapping("/content/delete/{id}")
    public String deleteContent(@PathVariable int id, Content content) {
        String password = content.getPassword();
        contentService.deleteContent(id, password);
        return "redirect:/basic-board";
    }

    // 이미지 출력
    @ResponseBody
    @GetMapping("/images/{filename}")
    public Resource showImage(@PathVariable String filename) throws MalformedURLException {
        return new UrlResource("file:" + fileStore.getFullPath(filename));
    }

    // 첨부파일 다운로드
    @GetMapping("/attach/{id}")
    public ResponseEntity<Resource> downloadAttach(@PathVariable int id) throws MalformedURLException {
        Content content = contentService.getContent(id);

        System.out.println(content.getAttachFile());
        String storeFilename = content.getAttachFile().getStoreFilename();
        String uploadFilename = content.getAttachFile().getUploadFilename();
        System.out.println(fileStore.getFullPath(storeFilename));

        UrlResource urlResource = new UrlResource("file:" + fileStore.getFullPath(storeFilename));

        // 업로드 한 파일명이 한글인 경우 아래 작업을 안해주면 한글이 깨질 수 있음
        String encodedUploadFileName = UriUtils.encode(uploadFilename, StandardCharsets.UTF_8);
        String contentDisposition = "attachment; filename=\"" + encodedUploadFileName + "\"";

        // header에 CONTENT_DISPOSITION 설정을 통해 클릭 시 다운로드 진행
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, contentDisposition)
                .body(urlResource);
    }*/


}
