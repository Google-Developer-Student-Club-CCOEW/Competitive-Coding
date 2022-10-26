#include<stdio.h>

int t=0, R=0, C=0;
int G[300][300];

int proc(int g[300][300], int x, int y)
{
    register int s = 0;
    if (x > 0)
    {
        // up
        if (g[x][y] - g[x-1][y] > 1)
        {
            s += g[x][y] - g[x-1][y] - 1;
            g[x-1][y] = g[x][y] - 1;
        }
    }
    if (x < R-1)
    {
        // down
        if (g[x][y] - g[x+1][y] > 1)
        {
            s += g[x][y] - g[x+1][y] - 1;
            g[x+1][y] = g[x][y] - 1;
        }
    }
    if (y > 0)
    {
        // left
        if (g[x][y] - g[x][y-1] > 1)
        {
            s += g[x][y] - g[x][y-1] - 1;
            g[x][y-1] = g[x][y] - 1;
        }
    }
    if (y < C-1)
    {
        // right
        if (g[x][y] - g[x][y+1] > 1)
        {
            s += g[x][y] - g[x][y+1] - 1;
            g[x][y+1] = g[x][y] - 1;
        }
    }
    return s;
}

int main()
{
    scanf("%d", &t);
    for (int i=0; i<t; i++)
    {
        scanf("%d %d", &R, &C);
        for (int x=0; x<R; x++)
            for (int y=0; y<C; y++)
                scanf("%d", G[x]+y);
        register long long s=0;
        register int not_over = 600;
        while (not_over)
        {
            not_over = 0;
            register int add = 0;
            for (register int x=0; x<R; x++)
                for (register int y=0; y<C; y++)
                {
                    add = proc(G, x, y);
                    if (add)
                    {
                        s += add;
                        not_over++;
                    }
                }
        }
        printf("Case #%d: %lld\n", i+1, s);
    }
    return 0;
}