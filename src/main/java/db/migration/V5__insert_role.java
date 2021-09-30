package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class V5__insert_role extends BaseJavaMigration {
    @Override
    public void migrate(final Context context) throws Exception {
        new JdbcTemplate(new SingleConnectionDataSource(context.getConnection(), true))
                .execute("" +
                        "insert into app_role (name) values ('ADMIN');" +
                        "insert into app_role (name) values ('USER');" +
                        "");

    }
}
