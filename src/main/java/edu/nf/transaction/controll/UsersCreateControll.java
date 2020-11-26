package edu.nf.transaction.controll;

import edu.nf.transaction.dao.UsersCreateDao;
import edu.nf.transaction.dao.impl.UsersCreateDaoImpl;
import edu.nf.transaction.entity.UsersCreate;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.PlainView;
import org.nf.mvc.view.View;

import java.util.UUID;

/**
 * @author Taoist-priest
 * @date 2020/11/26
 */
public class UsersCreateControll {
    @WebRequest("/users_create")
    public View CreateUsers(UsersCreate users) {
        UsersCreate usersCreate = new UsersCreate();
        String userUuid = UUID.randomUUID().toString().replace("-", "");
        usersCreate.setUserUuid(userUuid);
        usersCreate.setUserPhone(users.getUserPhone());
        usersCreate.setUserPassword(users.getUserPassword());
        UsersCreateDao dao = new UsersCreateDaoImpl();
        dao.usersCreate(usersCreate);
        return new PlainView("注册成功");
    }
}
