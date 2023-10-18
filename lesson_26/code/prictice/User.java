package prictice;


/*
1) @ exists and only one
2) dot after @
3) after last dot minimum 2 symbols
4) alphabetic, digits, _ , - , . , @
 */

public class User {
    // поля класса
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " Isn't valid");
        }
    }

    private boolean validateEmail(String email) {
        int indexAt = email.indexOf('@'); // ищем индекс собаки
        if (indexAt <= 0 || indexAt == -1 || indexAt != email.lastIndexOf('@')) { //@собака нашлась ли в строке и стоит не 2 собаки
            return false; // возвращаем фальш
        }
        if (email.indexOf('.', indexAt) == -1) { // не нашлась точка и ищем начиная с позиции собаки
            return false;
        }
        if (email.indexOf('.') >= email.length() - 2) {//после точки должно быть минимум 2 символа
            return false;
        }
        for (int i = 0; i < email.length(); i++) { //проверка на допустимые символы
            char c = email.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false;
            }
        }
        return true;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println(password + " Password not valid");
        }
    }

    /*
    1) min 8 symbols
    2) min one symbol of uppercase
    3) min one symbol of lowercase
    4) min one digit
    5) min one special symbol (!%@*&)
     */
    private boolean validatePassword(String password) {
        boolean[] valid = new boolean[6];
        if (password.length() >= 8) {
            valid[0] = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c == '!' || c == '@' || c == '*' || c == '&') {
                valid[1] = true;
            } else if (!(c == 34)){
                valid[5] = true;
            }else if (c >= 'A' && c <= 'Z'){
                valid[2] = true;
            } else if ((c >= 'a' && c <= 'z')) {
                valid[3] = true;
            } else if ((c >= '0' && c <= '9')) {
                valid[4] = true;
//            } else if (!(c == ' ')){
//                valid[5] = true;
//            }}
                }
        }
        for (int j = 0; j < valid.length; j++) {
            if (!(valid[j])) {
                return false;
            }
        }
        return true;

    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        User user = (User) object;

        return email.equals(user.email);
    }
}


