package org.example.expert.domain.todo.repository;

import com.querydsl.core.QueryFactory;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.example.expert.domain.todo.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static org.example.expert.domain.todo.entity.QTodo.todo;

@Repository
@RequiredArgsConstructor
public class TodoQueryRepository {


    private final JPAQueryFactory queryFactory;

    public Optional<Todo> findByIdWithUser(Long todoId){
       Todo result = queryFactory.selectFrom(todo)
                .leftJoin(todo.user)
                .where(
                      eqTodoId(todoId)
                ).fetchOne();

       return Optional.of(result);
    }

    private BooleanExpression eqTodoId(Long todoId){
        return todo.id.eq(todoId);
    }
}
