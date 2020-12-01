package edu.nf.transaction.controll;

import edu.nf.transaction.dao.UsersCreateDao;
import edu.nf.transaction.dao.impl.UsersCreateDaoImpl;
import edu.nf.transaction.entity.UsersCreate;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.ForwardView;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * @author Taoist-priest
 * @date 2020/11/26
 */
public class UsersCreateControll {
    @WebRequest("/users_create")
    public View CreateUsers(UsersCreate users, HttpServletRequest request) {
        UsersCreate usersCreate = new UsersCreate();
        String userUuid = UUID.randomUUID().toString().replace("-", "");
        usersCreate.setUserUuid(userUuid);
        usersCreate.setUserPhone(users.getUserPhone());
        usersCreate.setUserPassword(users.getUserPassword());
        UsersCreateDao dao = new UsersCreateDaoImpl();
        dao.usersCreate(usersCreate);
        String uri = request.getRequestURI();
        System.out.println(uri);
        return new ForwardView("../page/show.html");
    }

    @WebRequest("/usersList")
    public View usersList() {
        return new JsonView(new UsersCreateDaoImpl().usersList());
    }
}
