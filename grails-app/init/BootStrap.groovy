import com.thirdgen.mock.User

class BootStrap {

    def init = { servletContext ->
        new User(username:"Joe Tester").save()
        new User(username:"Sally Tester").save()
    }
    def destroy = {
    }
}
