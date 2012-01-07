
final class ch extends nj {

   private static boolean[] u = new boolean[8];
   private long f_i;
   private static boolean[] t = new boolean[32];
   boolean r = false;
   private boolean v = false;
   private Object[] m = aqa.a(new Object[2], 18);
   ub[] j;
   private long o;
   int s = 0;
   Object[] q = ura.a(-57, new Object[2]);
   private int n = 0;
   int w;
   private boolean x = false;
   private int p = 0;
   Object[] f_l;
   boolean k = false;


   final void a(ta var1, long var2, Object[][] var4, Object[][] var5, boolean var6) {
      if(!this.r) {
         this.a(var1, var4, var6);
         this.a(var5, var6);
         this.o = var2;
      }
   }

   final Object[] b() {
      return this.f_l;
   }

   final boolean a(ta var1, long var2) {
      if(this.o != this.f_i) {
         this.d();
      } else {
         this.c();
      }

      if(var2 - this.o > 750L) {
         this.f();
         return false;
      } else {
         int var8 = (int)(var2 - this.f_i);
         Object[] var9;
         if(this.x) {
            tta var4;
            tta var5;
            for(var9 = (var4 = (tta)om.a(this.m, false)) == null?null:var4.k; var9 != null; var9 = (var5 = (tta)pw.a(this.m, -75)) == null?null:var5.k) {
               for(int var10 = 0; var10 < ((int[])((int[])((Object[])((Object[])var9[6]))[1]))[14]; ++var10) {
                  vea.a(1, var1, var9, var2, !this.v, false);
               }
            }

            this.x = false;
         }

         tta var6;
         tta var7;
         for(var9 = (var6 = (tta)om.a(this.m, false)) == null?null:var6.k; var9 != null; var9 = (var7 = (tta)pw.a(this.m, 110)) == null?null:var7.k) {
            vea.a(var8, var1, var9, var2, !this.v, false);
         }

         this.f_i = var2;
         return true;
      }
   }

   final void a(ta var1) {
      Object[] var4 = (Object[])((Object[])this.f_l[0]);
      if(var4 != null && 1 == var4.length && var4[0].equals(Integer.valueOf(0))) {
         this.a(-73, true);
      }

      while(true) {
         va var5 = ((va)var4[1]).p;
         if(var4[1] == var5) {
            var4[0] = null;

            tta var2;
            tta var3;
            for(Object[] var6 = (var2 = (tta)om.a(this.m, false)) == null?null:var2.k; var6 != null; var6 = (var3 = (tta)pw.a(this.m, -68)) == null?null:var3.k) {
               ala.a(1, var6, var1, this.f_i);
            }

            return;
         }

         var5.a((byte)-98);
      }
   }

   final void f() {
      this.r = true;

      qsa var1;
      qsa var2;
      for(Object[] var4 = (var1 = (qsa)dda.a(this.q, 2)) == null?null:var1.t; var4 != null; var4 = (var2 = (qsa)client.a(this.q, -28280)) == null?null:var2.t) {
         if(((int[])((int[])((Object[])((Object[])var4[4]))[1]))[3] == 1) {
            ((tha)(var4 == null?null:var4[2])).a(8192);
         }
      }

      for(int var5 = 0; var5 < this.j.length; ++var5) {
         if(this.j[var5] != null) {
            this.j[var5].b();
            this.j[var5] = null;
         }
      }

      this.s = 0;
      this.m = aqa.a(new Object[2], 53);
      this.n = 0;
      this.q = ura.a(-68, new Object[2]);
      this.p = 0;
      this.a(1);
      cia.g[Class_ss.f] = this;
      Class_ss.f = Class_ss.f + 1 & rha.j[dq.h];
   }

   final void a(int var1, int var2, int var3, int var4, int var5) {
      this.w = var1;
   }

   final void e() {
      this.x = true;
   }

   private final void a(int var1, boolean var2) {
      gt.a(tsa.h, -126, this);
      this.o = (long)var1;
      this.f_i = (long)var1;
      this.x = true;
      this.k = var2;
   }

   final void a(long var1) {
      this.o = var1;
   }

   static final ch b(int var0, boolean var1) {
      if(Class_ss.f != gia.c) {
         ch var2 = cia.g[gia.c];
         gia.c = gia.c + 1 & rha.j[dq.h];
         var2.a(var0, var1);
         return var2;
      } else {
         return new ch(var0, var1);
      }
   }

   private final void a(Object[][] var1, boolean var2) {
      int var10;
      for(var10 = 0; var10 < 8; ++var10) {
         u[var10] = false;
      }

      qsa var3;
      qsa var4;
      label106:
      for(Object[] var12 = (var3 = (qsa)dda.a(this.q, 2)) == null?null:var3.t; var12 != null; var12 = (var4 = (qsa)client.a(this.q, -28280)) == null?null:var4.t) {
         if(var1 != null) {
            for(int var11 = 0; var11 < var1.length; ++var11) {
               if(var12[0] == var1[var11] || var12[0] == var1[var11][2]) {
                  u[var11] = true;
                  kfa.a(4562, var12);
                  continue label106;
               }
            }
         }

         if(!var2) {
            ((lm)(var12 == null?null:var12[2])).a((byte)84);
            --this.p;
            if(((tha)(var12 == null?null:var12[2])).b((byte)-31)) {
               ((tha)(var12 == null?null:var12[2])).a(8192);
               --dra.f_i;
            }
         }
      }

      if(var1 != null) {
         for(var10 = 0; var10 < var1.length && var10 != 8 && this.p != 8; ++var10) {
            if(!u[var10]) {
               Object[] var13 = null;
               if(((int[])((int[])lma.a(var1[var10], (byte)-123)[1]))[3] == 1 && dra.f_i < 32) {
                  var13 = cw.a(var1[var10], 1, new Object[5], this);
                  Class_cs.a(111, (long)((int[])((int[])var1[var10][1]))[4], eia.c, (tha)(var13 == null?null:var13[2]));
                  ++dra.f_i;
               }

               if(var13 == null) {
                  var13 = cw.a(var1[var10], 1, new Object[5], this);
               }

               client.a(-20, this.q, (lm)(var13 == null?null:var13[2]));
               ++this.p;
               u[var10] = true;
            }
         }
      }

   }

   private final void a(ta var1, Object[][] var2, boolean var3) {
      int var8;
      for(var8 = 0; var8 < 32; ++var8) {
         t[var8] = false;
      }

      tta var4;
      tta var5;
      label82:
      for(Object[] var10 = (var4 = (tta)om.a(this.m, false)) == null?null:var4.k; var10 != null; var10 = (var5 = (tta)pw.a(this.m, 97)) == null?null:var5.k) {
         if(var2 != null) {
            for(int var9 = 0; var9 < var2.length; ++var9) {
               if(var10[2] == var2[var9] || var10[2] == var2[var9][2]) {
                  t[var9] = true;
                  ke.a((byte)62, var10);
                  ((boolean[])((boolean[])var10[3]))[1] = false;
                  continue label82;
               }
            }
         }

         if(!var3) {
            if(((int[])((int[])var10[1]))[6] == 0) {
               ((nj)(var10 == null?null:var10[8])).a(1);
               --this.n;
            } else {
               ((boolean[])((boolean[])var10[3]))[1] = true;
            }
         }
      }

      if(var2 != null) {
         for(var8 = 0; var8 < var2.length && var8 != 32 && this.n != 32; ++var8) {
            if(!t[var8]) {
               Object[] var11 = qf.a(new Object[10], var2[var8], this.o, var1, this, 9);
               gt.a(this.m, -122, (nj)(var11 == null?null:var11[8]));
               ++this.n;
               t[var8] = true;
            }
         }
      }

   }

   private final void c() {
      this.v = false;
   }

   final Object[] a() {
      Object[] var1 = (Object[])((Object[])this.f_l[0]);
      if(null != var1 && (-6 == ~var1.length && var1[2].equals(Integer.valueOf(2)) && var1[2].equals(Boolean.valueOf(false)) || -9 == ~var1.length || -11 == ~var1.length)) {
         this.s = 5;
      }

      while(true) {
         va var2 = ((va)var1[1]).p;
         if(var2 == var1[1]) {
            var1[0] = null;

            for(int var3 = 0; var3 < this.j.length; ++var3) {
               if(this.j[var3] != null && this.j[var3].F != null) {
                  uua.a((va)this.j[var3], (Object[])((Object[])this.f_l[0]), (byte)-59);
               }
            }

            return this.f_l;
         }

         var2.a((byte)-98);
      }
   }

   final void d() {
      this.v = true;
   }

   private ch(int var1, boolean var2) {
      Object[] var4 = new Object[]{Class_n.a(new Object[2], -127)};
      this.f_l = var4;
      this.j = new ub[8192];
      this.a(var1, var2);
   }

}
