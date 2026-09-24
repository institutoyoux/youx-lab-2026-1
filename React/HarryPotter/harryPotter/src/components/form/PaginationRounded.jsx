import Pagination from "@mui/material/Pagination";
import Stack from "@mui/material/Stack";
import styles from "./PaginationRounded.module.css";

export default function PaginationRounded({ count, handleChange, page }) {
  return (
    <Stack spacing={2}>
      <Pagination
        className={styles.pagination}
        variant="outlined"
        count={count}
        shape="rounded"
        page={page}
        onChange={handleChange}
        color="primary"
      />
    </Stack>
  );
}
