package MainInstagram;

import java.util.Objects;

public class UserManager implements Helper {
    private User[] users = new User[20];
    private int count;

    @Override
    public String addUser(User user) {
        if (user.getName().equals(null) || user.getUserName().equals(null)) return "User ma'lumotlari to'liq emas";
        for (User user1 : users) {
            if(Objects.nonNull(user1)){
                if (user1.getUserName().equals(user.getUserName()) ||
                        user1.getEmail().equals(user.getEmail())) {
                    return "Bunday foydalanuvchi mavjud";
                }
            }
        }
        if(count<users.length)
            users[count++] = user;

        return "Saqlandi";
    }

    @Override
    public String getAllUser() {
        if (users.length < 1) return "Userlar mavjud emas";
        for (User u : users) {
            if(Objects.nonNull(u)){return u.toString();}
        }
        return "";
    }

    @Override
    public String updateUser(String userName) {
        for (User user : users) {
            if (Objects.nonNull(user)) {
                if (user.getUserName().equals(userName)) {
                    System.out.println("O'zgartirildi");
                    return user.toString();
                }
            }
        }
        return "User topilmadi";
    }

    @Override
    public String deleteUser(String userName) {
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equals(userName)) {
                    user = null;
                    return "User o'chirildi";
                }
            }
        }
        return "user topilmadi";
    }
}
